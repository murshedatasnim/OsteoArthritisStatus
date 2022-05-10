package com.example.osteoarthritisstatus;

public class profileHelper {
    private String UID;
    private String PID;
    private String phone;

    public profileHelper(String UID, String PID, String phone) {
        this.UID = UID;
        this.PID = PID;
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
