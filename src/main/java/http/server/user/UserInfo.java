package main.java.http.server.user;

import main.java.http.server.annotation.Validate;

import java.io.Serializable;

public class UserInfo implements Serializable {

    @Validate(type = Validate.ValidateType.STRING, require = Validate.Require.TRUE)
    private String userId;

    @Validate(type = Validate.ValidateType.NUMBER, require = Validate.Require.TRUE)
    private String userPsd;

    public UserInfo() {
        this.setUserId("");
        this.setUserPsd("");
    }

    public UserInfo(String userId, String userPsd) {
        this.setUserId(userId);
        this.setUserPsd(userPsd);
    }

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

    @Override
    public String toString() {
        return "UserInfo: " + this.getUserId() + "," + this.getUserPsd();
    }

}
