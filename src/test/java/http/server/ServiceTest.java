package test.java.http.server;

import main.java.http.server.Service;
import main.java.http.server.user.Passport;
import main.java.http.server.user.UserInfo;

public class ServiceTest {
    public static void main(String[] args) {
        UserInfo userInfo1 = new UserInfo("wjd", "123");
        UserInfo userInfo2 = new UserInfo("", "123");
        UserInfo userInfo3 = new UserInfo("wjd", "");
        UserInfo userInfo4 = new UserInfo("wjd1", "123");
        UserInfo userInfo5 = new UserInfo("wjd", "a123");

        Passport passport1 = new Passport("wjd", "123");
        Passport passport2 = new Passport("", "123");
        Passport passport3 = new Passport("wjd", "");
        Passport passport4 = new Passport("wjd1", "123");
        Passport passport5 = new Passport("wjd", "a123");

        Passport passportBuilder = Passport.builder().name("Okato").id("291239").build();

        Service service = new Service();
        service.execute(userInfo1);
        service.execute(userInfo2);
        service.execute(userInfo3);
        service.execute(userInfo4);
        service.execute(userInfo5);

        service.execute(passport1);
        service.execute(passport2);
        service.execute(passport3);
        service.execute(passport4);
        service.execute(passport5);

        service.execute(passportBuilder);
    }
}
