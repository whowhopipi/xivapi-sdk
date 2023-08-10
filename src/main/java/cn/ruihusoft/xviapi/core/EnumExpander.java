package cn.ruihusoft.xviapi.core;

import feign.Param;

public class EnumExpander implements Param.Expander {

    @Override
    public String expand(Object value) {
        if (!value.getClass().isEnum()) {
            // 如果不是枚举类型，则返回字符串
            return value.toString();
        }
        Enum enums = (Enum) value;
        return enums.name();
    }
}
