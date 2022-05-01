package com.example.osteoarthritisstatus;

public class profileHelper {
    private String UID;
    private String PID;

    public profileHelper(String UID, String PID) {
        this.UID = UID;
        this.PID = PID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }
}
