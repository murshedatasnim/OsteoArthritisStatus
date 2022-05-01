package com.example.osteoarthritisstatus;

public class sociodemographicInfoHelper {
    private String UID;
    private String occupation;
    private String workAssociation;
    private String houseType;
    private String floor;
    private String frequentUseOfStaircase;
    private String houseToiletType;
    private String prayerPosition;

    public sociodemographicInfoHelper(String UID, String occupation, String workAssociation, String houseType, String floor, String frequentUseOfStaircase, String houseToiletType, String prayerPosition) {
        this.UID = UID;
        this.occupation = occupation;
        this.workAssociation = workAssociation;
        this.houseType = houseType;
        this.floor = floor;
        this.frequentUseOfStaircase = frequentUseOfStaircase;
        this.houseToiletType = houseToiletType;
        this.prayerPosition = prayerPosition;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getWorkAssociation() {
        return workAssociation;
    }

    public void setWorkAssociation(String workAssociation) {
        this.workAssociation = workAssociation;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getFrequentUseOfStaircase() {
        return frequentUseOfStaircase;
    }

    public void setFrequentUseOfStaircase(String frequentUseOfStaircase) {
        this.frequentUseOfStaircase = frequentUseOfStaircase;
    }

    public String getHouseToiletType() {
        return houseToiletType;
    }

    public void setHouseToiletType(String houseToiletType) {
        this.houseToiletType = houseToiletType;
    }

    public String getPrayerPosition() {
        return prayerPosition;
    }

    public void setPrayerPosition(String prayerPosition) {
        this.prayerPosition = prayerPosition;
    }
}
