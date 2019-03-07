package test.java.service;

import main.java.service.ChangeLetter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChangeLetterTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/java/service/beans.xml");
        ChangeLetter changeLetter = (ChangeLetter) applicationContext.getBean("changeLetter");
        System.out.println(changeLetter.change());
    }
}
