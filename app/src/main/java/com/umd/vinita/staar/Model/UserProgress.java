package com.umd.vinita.staar.Model;

/**
 * Created by Vinita on 2/25/2017.
 */
public class UserProgress {
    String modulesCompleted;
    String curentModule;
    int currentModuleID;
    String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setModulesCompleted(String modulesCompleted) {
        this.modulesCompleted = modulesCompleted;
    }

    public void setCurentModule(String curentModule) {
        this.curentModule = curentModule;
    }

    public void setCurrentModuleID(int currentModuleID) {
        this.currentModuleID = currentModuleID;
    }

    public String getModulesCompleted() {
        return modulesCompleted;
    }

    public String getCurentModule() {
        return curentModule;
    }

    public int getCurrentModuleID() {
        return currentModuleID;
    }






    }
