package com.pluralsight;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;


    // Get and set Serial Number
    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    //Get and Set Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //Get and Set Carrier

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    //Get and Set Phone Number

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Get and Set Owner

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CellPhone () {

        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";


        //Create another cellphone
        }
    public void dial(String phoneNumber) {
        System.out.printf("%s's phone is calling %s", owner, phoneNumber);
    }


    }




