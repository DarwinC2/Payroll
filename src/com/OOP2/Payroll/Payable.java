package com.OOP2.Payroll;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface Payable {

    public double getPaymentAmount();

    public void writeToFile();


}

//Employee Class
class Employee implements Payable {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private double amount;

    @Override
    public double getPaymentAmount(){

        return amount * 1500;
    }

    @Override
    public void writeToFile() {

        String filename = "paystub.txt"; // Setting file name to paystub.txt
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy"); //creating a formatter for the date
        LocalDate date = LocalDate.now(); //getting current date
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) { // Creating BufferedWriter and FileWriter objects to write data to the file
            writer.write("Name: " + firstName + " " + lastName + "\n"); // Writing employee name to file
            writer.write("Social Security Number: " + socialSecurityNumber + "\n"); // Writing employee SSN to file
            writer.write("Payment Amount: " + getPaymentAmount() + "\n"); // Writing employee payment amount to file
           writer.write("Date of Payment: " + date.format(formatter) + "\n");
            System.out.println("Data written to file: " + filename); // Printing message to console to confirm data has been written to file
        } catch (IOException e) { // Catching IOException if it occurs
            System.out.println("An error occurred while writing to the file: " + e.getMessage()); // Printing error message to console
        }
    }



    public Employee (){};
    public Employee (String firstName, String lastName, String socialSecurityNumber, double amount)
    {

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.amount = amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void display (){

        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Social Security: "+ socialSecurityNumber);
        System.out.println("Payment Amount: "+ getPaymentAmount());
    }
}


