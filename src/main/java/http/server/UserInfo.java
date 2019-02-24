package main.java.http.server;

import java.io.Serializable;

public class UserInfo implements Serializable {

    private String userId;

    private String userPsd;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPsd() {
        return userPsd;
    }

    public void setUserPsd(String userPsd) {
        this.userPsd = userPsd;
    }

}
