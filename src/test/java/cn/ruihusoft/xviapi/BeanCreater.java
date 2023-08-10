package cn.ruihusoft.xviapi;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Filter;
import cn.hutool.core.util.ClassUtil;
import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.google.common.base.CaseFormat;
import lombok.Setter;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;

public class BeanCreater {

    @Setter
    private String descPackage;
    @Setter
    private String descPath;

    private Set<String> unknowKey = new HashSet<>();

    public JSONObject readJsonFromFile(String path) {
        String json = FileUtil.readString(path, Charset.defaultCharset());
        return JSONUtil.parseObj(json);
    }

    public void createBean(JSONObject json, String fileName) {
        createBean(json, fileName, true);
    }

    public void createBean(JSONObject json, String fileName, boolean flag) {
        StringBuilder beanFile = new StringBuilder();
        beanFile.append("package ").append(descPackage).append(";\n");
        beanFile.append("\n");
        beanFile.append("import com.fasterxml.jackson.annotation.JsonProperty;\n");
        beanFile.append("import lombok.Data;\n");
        beanFile.append("\n");
        beanFile.append("@Data\n");
        beanFile.append("public class ").append(fileName).append(" {\n");
        beanFile.append("\n");

        Set<String> keys = json.keySet();

        for (String key : keys) {
            String varName = generatorName(key, true);
            beanFile.append("    @JsonProperty(\"" + key + "\")\n");
            // 判断值是什么类型
            String type = fetchFiledType(key, json.getObj(key));
            beanFile.append("    private " + type + " " + varName + ";\n");
            if (type.contains("Object")) {
                beanFile.append("    // FIXME 类型不确定：" + key + "\n");
                unknowKey.add(key);
            }
        }

        beanFile.append("}");

        if (flag) {
            FileUtil.writeString(beanFile.toString(), descPath + "/" + fileName + ".java", "utf-8");
        }
    }

    private String fetchFiledType(String key, Object value) {
        final String className = generatorName(key, false);

        Set<Class<?>> classes = ClassUtil.scanPackage("cn.ruihusoft.xviapi.pojo", new Filter<Class<?>>() {
            @Override
            public boolean accept(Class<?> aClass) {
                return aClass.getName().equals(className);
            }
        });

        String type = "Object";
        if (CollectionUtil.isEmpty(classes)) {
            type = className;
            // 原则上，还要继续扫描后面的
            createBean((JSONObject) value, className, false);
        } else if (value instanceof String) {
            type = "String";
        } else if (value instanceof Integer) {
            type = "Integer";
        } else if (value instanceof JSONObject) {
            type = className;
            createBean((JSONObject) value, className);
        } else if (value instanceof JSONArray) {
            JSONArray array = (JSONArray) value;
            if (array.isEmpty()) {
                type = "List<NULL>";
            } else {
                Object one = array.get(0);
                type = "List<" + fetchFiledType(key, one) + ">";
            }
        }

        return type;
    }

    private String generatorName(String key, boolean flag) {
        StringBuilder varName = new StringBuilder();
        boolean first = flag;
        boolean hasUnderline = false;
        for (char ch : key.toCharArray()) {
            if (first && (ch >= 'A' && ch <= 'Z')) {
                varName.append((char) (ch - ('A' - 'a')));
                continue;
            } else {
                first = false;
            }

            //
            if (ch == '_') {
                hasUnderline = true;
                continue;
            }

            if (hasUnderline && ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + 'A' - 'a');
            }
            varName.append(ch);
            hasUnderline = false;
        }
        return varName.toString();
    }

    public void printUnkownKey() {
        for (String key : unknowKey) {
            System.out.println(key);
        }
    }

}
