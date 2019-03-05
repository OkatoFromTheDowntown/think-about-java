package main.java.service;

public class UserService {
    private String name;

    private UserInfo userInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name);
        userInfo.howOld();
    }
}
