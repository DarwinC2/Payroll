package com.OOP2.Payroll;

public class CommissionEmployee extends Employee{

    private double grossSales;
    private double commissionRate;

    public CommissionEmployee (String firstName, String lastName,String socialSecurityNumber, double amount,
                               double grossSales, double commissionRate){

        super(firstName, lastName, socialSecurityNumber, amount);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }


    @Override
    public double getPaymentAmount() {
        return super.getPaymentAmount() + (grossSales * commissionRate);
    }

    @Override
    public void writeToFile() {
        super.writeToFile();
        getGrossSales()writeToFile();

    }

    @Override
    public  void display(){
    super.display();
    System.out.println("Gross Sales: "+ grossSales);
    System.out.println("Commission Rate: "+ commissionRate);}
}

