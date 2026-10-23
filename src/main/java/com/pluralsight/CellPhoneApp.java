package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {

        CellPhone newPhoneWhoDis = new CellPhone();
        CellPhone DanaWyattsPhone = new CellPhone();

        Scanner input = new Scanner(System.in);


        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestions(input, "What is the serial number?")));

        newPhoneWhoDis.setModel(askQuestions(input, "What is the model?"));
        newPhoneWhoDis.setCarrier(askQuestions(input, "Who is the carrier?"));
        newPhoneWhoDis.setPhoneNumber(askQuestions(input, "What is the phone number?"));
        newPhoneWhoDis.setOwner(askQuestions(input, "Who is the owner of the phone?"));

        //Generate to string to class
        System.out.println(newPhoneWhoDis.toString().trim());

        System.out.println("Serial Number" + " " + newPhoneWhoDis.getSerialNumber());
        System.out.println("Model" + " " + newPhoneWhoDis.getModel());
        System.out.println("Carrier" + " " + newPhoneWhoDis.getCarrier());
        System.out.println("Owner" + " " + newPhoneWhoDis.getOwner());
        System.out.println("Phone Number" + " " + newPhoneWhoDis.getPhoneNumber());

        //Add information for dana wyatt
        DanaWyattsPhone.setSerialNumber(Integer.parseInt(askQuestions(input, "What is the serial number?")));

        DanaWyattsPhone.setModel(askQuestions(input, "What is the model?"));
        DanaWyattsPhone.setCarrier(askQuestions(input, "Who is the carrier?"));
        DanaWyattsPhone.setPhoneNumber(askQuestions(input, "What is the phone number?"));
        DanaWyattsPhone.setOwner(askQuestions(input, "Who is the owner of the phone?"));

        //Generate to string to class
        System.out.println(DanaWyattsPhone.toString().trim());

        System.out.println("Serial Number" + " " + DanaWyattsPhone.getSerialNumber());
        System.out.println("Model" + " " + DanaWyattsPhone.getModel());
        System.out.println("Carrier" + " " + DanaWyattsPhone.getCarrier());
        System.out.println("Owner" + " " + DanaWyattsPhone.getOwner());
        System.out.println("Phone Number" + " " + DanaWyattsPhone.getPhoneNumber());

        // Display both phones
        display(newPhoneWhoDis);
        display(DanaWyattsPhone);


        //Write code for firstPhone to dial secondPhone
        DanaWyattsPhone.dial(newPhoneWhoDis.getPhoneNumber());


    }


    public static String askQuestions(Scanner scanner, String question) {

        System.out.print(question + ":".trim());
        return scanner.nextLine();
    }

    public static void display(CellPhone somePhone) {

        System.out.println("");
        System.out.println("Serial Number =" + " " + somePhone.getSerialNumber() + "\n");
        System.out.println("Model =" + " " + somePhone.getModel().trim() + "\n");
        System.out.println("Carrier =" + " " + somePhone.getCarrier().trim() + "\n");
        System.out.println("Owner =" + " " + somePhone.getOwner().trim() + "\n");
        System.out.println("Phone Number =" + " " + somePhone.getPhoneNumber().trim() + "\n");
    }


}
