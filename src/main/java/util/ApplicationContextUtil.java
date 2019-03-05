package main.java.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

final public class ApplicationContextUtil {

    private static ApplicationContext applicationContext;

    private ApplicationContextUtil() {}

    static {
        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}
