package com.example.ex2_form_medical_declaration.models;

import java.sql.Date;

public class MedicalDeclaration {
    private String fullName;
    private Date birthDate;
    private String gender;
    private String nationality;
    private String idNumber;
    private String transportationType;
    private String vehicleNumber;
    private Date startDate;
    private Date endDate;
    private String address;
    private String email;
    private boolean fever;
    private boolean cough;
    private boolean shortnessOfBreath;
    private boolean fatigue;
    private boolean contactWithInfected;
    private boolean contactWithCountryOutside;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTransportationType() {
        return transportationType;
    }

    public void setTransportationType(String transportationType) {
        this.transportationType = transportationType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFever() {
        return fever;
    }

    public void setFever(boolean fever) {
        this.fever = fever;
    }

    public boolean isCough() {
        return cough;
    }

    public void setCough(boolean cough) {
        this.cough = cough;
    }

    public boolean isShortnessOfBreath() {
        return shortnessOfBreath;
    }

    public void setShortnessOfBreath(boolean shortnessOfBreath) {
        this.shortnessOfBreath = shortnessOfBreath;
    }

    public boolean isFatigue() {
        return fatigue;
    }

    public void setFatigue(boolean fatigue) {
        this.fatigue = fatigue;
    }

    public boolean isContactWithInfected() {
        return contactWithInfected;
    }

    public void setContactWithInfected(boolean contactWithInfected) {
        this.contactWithInfected = contactWithInfected;
    }

    public boolean isContactWithCountryOutside() {
        return contactWithCountryOutside;
    }

    public void setContactWithCountryOutside(boolean contactWithCountryOutside) {
        this.contactWithCountryOutside = contactWithCountryOutside;
    }
}
