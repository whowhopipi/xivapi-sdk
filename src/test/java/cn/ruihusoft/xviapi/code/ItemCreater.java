package cn.ruihusoft.xviapi.code;

import cn.hutool.json.JSONObject;
import cn.ruihusoft.xviapi.AbstractBeanCreater;
import org.junit.Test;

public class ItemCreater extends AbstractBeanCreater {

    @Test
    public void test1() {
        creater.setDescPackage("cn.ruihusoft.xviapi.pojo.action");
        creater.setDescPath("D:\\Workspace\\git\\xivapi-sdk\\src\\main\\java\\cn\\ruihusoft\\xviapi\\pojo\\action\\bak");

        JSONObject json = creater.readJsonFromFile("D:\\Workspace\\xviapi.json");
        creater.createBean(json, "CraftActionResponse");
    }
}
