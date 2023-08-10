package cn.ruihusoft.xviapi;

import org.junit.After;

public class AbstractBeanCreater {
    protected BeanCreater creater = new BeanCreater();

    @After
    public void print() {
        creater.printUnkownKey();
    }
}
