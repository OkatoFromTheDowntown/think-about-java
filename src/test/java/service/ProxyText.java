package test.java.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProxyText {
    public static void main(String... args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/java/service/aop/proxy-settings.xml");
        
    }
}
