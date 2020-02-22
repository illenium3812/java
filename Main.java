package com.company;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	int x = 0;
	String binary;
	String num2;
	Scanner sc = new Scanner(System.in);
	while (x != 1) {
	    binary="";

        System.out.println("Press 1 for Decimal to Binary Conversion");
        System.out.println("Press 2 for Binary to Decimal Conversion");
        int choice = sc.nextInt();
        if (choice == 1)
        {
            System.out.println("Enter Decimal Number: ");
            int num = sc.nextInt();
            if (num == 0){
                System.out.println("00000000");
            }
            while(num!=0 && num>0){
                int remainder = num%2;
                num = num/2;
                if (remainder == 1)
                {
                    binary = 1 + binary;
                }
                else
                {
                    binary = 0+binary;
                }
            }
            System.out.println("Your Answer is  " + binary);


        }
        else if (choice == 2)
        {
            System.out.println("Enter Binary Number: ");
             num2 = sc.next();
             int lenght = num2.length();
             char holder;
             int power = 0;
             int  num = 0;
             for (int i = lenght-1 ;i != -1;i-- )
             {
                 holder =num2.charAt(i);

                 if (holder == '0'){
                     power++;
                 }
                 if (holder == '1')
                 {
                     num = (int)(num + Math.pow(2,power));
                     power++;
                 }
             }
             System.out.println("Your Answer : " + num);

        }
        else{
            System.out.println("Invalid selection! Please press 1 or 2");
        }






        System.out.println("Do you wanna Convert Next? Press 1 for Yes Press any key to exit");
        int exit = (int)(sc.nextInt());
        if (exit == 1){}
        else{
            x = 1;
        }



    }

    }
}
