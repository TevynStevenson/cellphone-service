package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApp {
    public static void main(String[] args) {

        CellPhone newPhoneWhoDis = new CellPhone();

        Scanner input = new Scanner(System.in);


        newPhoneWhoDis.setSerialNumber(Integer.parseInt(askQuestions(input, "What is the serial number?")));

        newPhoneWhoDis.setModel(askQuestions(input,"What is the model?"));
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

        display(newPhoneWhoDis);
        display(newPhoneWhoDis);

        //Declare cellphone1 and cellphone2
        String cellPhone1;
        String cellPhone2;

        //Write code for firstPhone to dial secondPhone



    }


    public static String askQuestions(Scanner scanner, String question){

        System.out.print(question + ":".trim());
        return scanner.nextLine();
    }

public static void display(CellPhone somePhone){
    System.out.println("Serial Number" + " " + somePhone.getSerialNumber());
    System.out.println("Model" + " " + somePhone.getModel().trim());
    System.out.println("Carrier" + " " + somePhone.getCarrier().trim());
    System.out.println("Owner" + " " + somePhone.getOwner().trim());
    System.out.println("Phone Number" + " " + somePhone.getPhoneNumber().trim());
}


}
