package com.example.osteoarthritisstatus;

import java.util.ArrayList;

public class ClinicalInfoHelper {
    private String UID;
    private String height, weight, waist_circumference;
    private String isKneePain, affectedKnee;
    private ArrayList<String> symptoms;
    private String isPainInOtherJoints;
    private ArrayList<String> otherJointsHavingPain;
    private String isChronicIllness;
    private ArrayList<String> chronicIllnesses;
    private String menstrualHistory;
    private String isSmoker, sticksPerDay;
    private String isAlcoholic, alcoholIntakeFrequency;
    private String sportsActivity, isAnyRecentInjury, recentInjury;

    public ClinicalInfoHelper(String UID, String height, String weight, String waist_circumference, String isKneePain, String affectedKnee, ArrayList<String> symptoms, String isPainInOtherJoints, ArrayList<String> otherJointsHavingPain, String isChronicIllness, ArrayList<String> chronicIllnesses, String menstrualHistory, String isSmoker, String sticksPerDay, String isAlcoholic, String alcoholIntakeFrequency, String sportsActivity, String isAnyRecentInjury, String recentInjury) {
        this.UID = UID;
        this.height = height;
        this.weight = weight;
        this.waist_circumference = waist_circumference;
        this.isKneePain = isKneePain;
        this.affectedKnee = affectedKnee;
        this.symptoms = symptoms;
        this.isPainInOtherJoints = isPainInOtherJoints;
        this.otherJointsHavingPain = otherJointsHavingPain;
        this.isChronicIllness = isChronicIllness;
        this.chronicIllnesses = chronicIllnesses;
        this.menstrualHistory = menstrualHistory;
        this.isSmoker = isSmoker;
        this.sticksPerDay = sticksPerDay;
        this.isAlcoholic = isAlcoholic;
        this.alcoholIntakeFrequency = alcoholIntakeFrequency;
        this.sportsActivity = sportsActivity;
        this.isAnyRecentInjury = isAnyRecentInjury;
        this.recentInjury = recentInjury;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWaist_circumference() {
        return waist_circumference;
    }

    public void setWaist_circumference(String waist_circumference) {
        this.waist_circumference = waist_circumference;
    }

    public String getIsKneePain() {
        return isKneePain;
    }

    public void setIsKneePain(String isKneePain) {
        this.isKneePain = isKneePain;
    }

    public String getAffectedKnee() {
        return affectedKnee;
    }

    public void setAffectedKnee(String affectedKnee) {
        this.affectedKnee = affectedKnee;
    }

    public ArrayList<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(ArrayList<String> symptoms) {
        this.symptoms = symptoms;
    }

    public String getIsPainInOtherJoints() {
        return isPainInOtherJoints;
    }

    public void setIsPainInOtherJoints(String isPainInOtherJoints) {
        this.isPainInOtherJoints = isPainInOtherJoints;
    }

    public ArrayList<String> getOtherJointsHavingPain() {
        return otherJointsHavingPain;
    }

    public void setOtherJointsHavingPain(ArrayList<String> otherJointsHavingPain) {
        this.otherJointsHavingPain = otherJointsHavingPain;
    }

    public String getIsChronicIllness() {
        return isChronicIllness;
    }

    public void setIsChronicIllness(String isChronicIllness) {
        this.isChronicIllness = isChronicIllness;
    }

    public ArrayList<String> getChronicIllnesses() {
        return chronicIllnesses;
    }

    public void setChronicIllnesses(ArrayList<String> chronicIllnesses) {
        this.chronicIllnesses = chronicIllnesses;
    }

    public String getMenstrualHistory() {
        return menstrualHistory;
    }

    public void setMenstrualHistory(String menstrualHistory) {
        this.menstrualHistory = menstrualHistory;
    }

    public String getIsSmoker() {
        return isSmoker;
    }

    public void setIsSmoker(String isSmoker) {
        this.isSmoker = isSmoker;
    }

    public String getSticksPerDay() {
        return sticksPerDay;
    }

    public void setSticksPerDay(String sticksPerDay) {
        this.sticksPerDay = sticksPerDay;
    }

    public String getIsAlcoholic() {
        return isAlcoholic;
    }

    public void setIsAlcoholic(String isAlcoholic) {
        this.isAlcoholic = isAlcoholic;
    }

    public String getAlcoholIntakeFrequency() {
        return alcoholIntakeFrequency;
    }

    public void setAlcoholIntakeFrequency(String alcoholIntakeFrequency) {
        this.alcoholIntakeFrequency = alcoholIntakeFrequency;
    }

    public String getSportsActivity() {
        return sportsActivity;
    }

    public void setSportsActivity(String sportsActivity) {
        this.sportsActivity = sportsActivity;
    }

    public String getIsAnyRecentInjury() {
        return isAnyRecentInjury;
    }

    public void setIsAnyRecentInjury(String isAnyRecentInjury) {
        this.isAnyRecentInjury = isAnyRecentInjury;
    }

    public String getRecentInjury() {
        return recentInjury;
    }

    public void setRecentInjury(String recentInjury) {
        this.recentInjury = recentInjury;
    }
}
