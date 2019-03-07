package test.java.service;

import main.java.service.ChangeLetter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class ChangeLetterTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("main/java/service/beans.xml");
//        ChangeLetter changeLetter = (ChangeLetter) applicationContext.getBean("changeLetter");
//        System.out.println(changeLetter.change());

//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("main/java/service/beans.xml"));
//        ChangeLetter changeLetter = (ChangeLetter) beanFactory.getBean("changeLetter");
//        System.out.println(changeLetter.change());

        Resource resource = new ClassPathResource("main/java/service/beans.xml");
        BeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        beanDefinitionReader.loadBeanDefinitions(resource);
        ChangeLetter changeLetter = (ChangeLetter) beanFactory.getBean("changeLetter");
        System.out.println(changeLetter.change());
    }
}
