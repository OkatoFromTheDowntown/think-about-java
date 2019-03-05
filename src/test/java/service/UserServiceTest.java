package test.java.service;

import main.java.service.UserService;
import main.java.util.ApplicationContextUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {
    public static void main(String[] args) {

//        UserService userService = new UserService();
//        userService.setName("New UserService Without Spring");
//        userService.sayHello();

        /*  Fetch the application context
            ClassPathXmlApplicationContext = Dom4J + Java Reflection
            ...
            userService = Class.forName("main.java.service.UserService");
            userService.setName("xml");
            userInfo = Class.forName("main.java.service.UserInfo");
            userInfo.setAge();
            userService.setUserInfo(userInfo);
            applicationContent = new HashMap();
            applicationContent.put("userInfo", userInfo);
            applicationCOntent.put("userService", userService);
        */

//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext applicationContext = ApplicationContextUtil.getApplicationContext(); // Singleton AppContext
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHello();


    }
}
