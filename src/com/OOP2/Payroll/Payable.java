package com.OOP2.Payroll;

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


