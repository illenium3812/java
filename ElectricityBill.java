package com.company;
import java.util.Scanner;

public class ElectricityBill {
    private String customerName;
    private String customerAddress;
    private long customerNumber;
    private double preMeterReading;
    private double postMeterReading;
    private double billPrice;

    public ElectricityBill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :-");
        customerName = sc.nextLine();
        System.out.println("Enter Your Address :-");
        customerAddress = sc.nextLine();
        System.out.println("Enter Your Number :-");
        customerNumber = sc.nextLong();
        System.out.println("Enter Your Previous Meter Reading  :-");
        preMeterReading = sc.nextDouble();
        System.out.println("Enter Your Current Meter Reading :-");
        postMeterReading = sc.nextDouble();
    }
    public double Calculator(){
        double unitConsumed = postMeterReading - preMeterReading;
        double extraUnits;
        if (unitConsumed>500)
        {
            extraUnits = unitConsumed-500;
            billPrice = (extraUnits*60.00)+(200*45.00) + (200*30.00) + (100*15.00);
        }
        else if (unitConsumed<=500 && unitConsumed>300 )
        {
            extraUnits = unitConsumed-300;
            billPrice = (extraUnits*45.00)+(200*30.00) + (100*15.00);
        }

        else if (unitConsumed<=300 && unitConsumed>100)
        {
            extraUnits = unitConsumed-100;
            billPrice = (extraUnits*30) + (100*15.00);
        }

        else if (unitConsumed<=100 && unitConsumed>=0)
        {
            billPrice = unitConsumed * 15.00;
        }
        else if (unitConsumed<0){
            System.out.println("Units cant be negative Please Recheck the meter readings / Current should be greater then previous!");
            System.exit(1);
        }
        return billPrice;
    }
    public void billPrint()
    {
        System.out.println("\n\n\n");
        System.out.println("Name :" + customerName);
        System.out.println("Address :" + customerAddress);
        System.out.println("Contact Number :" + customerNumber);
        System.out.println("Total Price :" + billPrice);

    }
}
