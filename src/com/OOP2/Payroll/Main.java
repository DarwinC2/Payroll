package com.OOP2.Payroll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CommissionEmployee com = new CommissionEmployee("Darwin", "Dallas","2101012479",
                5000, 2400,8000);

com.display();
    }
}