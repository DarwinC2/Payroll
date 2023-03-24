package com.OOP2.Payroll;

public class HourlyEmployee extends Employee {

    private double wage;
    private double hours;

   public HourlyEmployee (){}



    public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber, double amount, double wage, double hours)
    {
        super(firstName, lastName, socialSecurityNumber, amount);
        this.wage = wage;
        this.hours = hours;



    }



    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double getPaymentAmount() {
            return super.getPaymentAmount() + (hours * wage);

    }

    @Override
    public  void display(){
        System.out.println();
        System.out.println();
       super.display();
        System.out.println("Wage: "+ wage);
        System.out.println("hours: "+ hours);}
}
