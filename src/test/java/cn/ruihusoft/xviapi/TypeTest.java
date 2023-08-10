package cn.ruihusoft.xviapi;

import com.google.common.base.CaseFormat;
import org.junit.After;
import org.junit.Test;

public class TypeTest {

    private String result;

    private String msg = "ID";

    @After
    public void print() {
        System.out.println(result);
    }

    @Test
    public void test1() {
        result = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, msg);
    }

    @Test
    public void test2() {
        msg = "I_D";
        result = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, msg);
    }

    @Test
    public void test3() {
        msg = "BaseParam1Target";
        result = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_CAMEL, msg);
    }

    @Test
    public void test4() {
        msg = "BaseParam1_Target";
        result = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, msg);
    }
}
