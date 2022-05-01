package com.example.osteoarthritisstatus;

//import java.util.Date;

public class KoosScoreHelper {
    private String date;
    private String koos;
    private String UID;

    public KoosScoreHelper(String date, String koos, String UID) {
        this.date = date;
        this.koos = koos;
        this.UID = UID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKoos() {
        return koos;
    }

    public void setKoos(String koos) {
        this.koos = koos;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }
}
