package com.umd.vinita.staar.Model;

import java.util.Date;

/**
 * Created by Vinita on 3/1/2017.
 */
public class User {
    String userID;
    String password;
    String userType;
    Boolean isUserActive;
    Date userCreated;
    Date userUpdated;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Boolean getUserActive() {
        return isUserActive;
    }

    public void setUserActive(Boolean userActive) {
        isUserActive = userActive;
    }

    public Date getUserCreated() {
        return userCreated;
    }

    public void setUserCreated(Date userCreated) {
        this.userCreated = userCreated;
    }

    public Date getUserUpdated() {
        return userUpdated;
    }

    public void setUserUpdated(Date userUpdated) {
        this.userUpdated = userUpdated;
    }




}

