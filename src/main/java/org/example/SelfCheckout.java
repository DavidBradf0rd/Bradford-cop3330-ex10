package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;


public class SelfCheckout
{
    public static void main( String[] args )
    {
        int  quantity1, quantity2, quantity3;
        double price1, price2, price3;

        Scanner input = new Scanner(System.in);

        System.out.print( "Enter the price of item 1: " );
        price1 = input.nextDouble();
        System.out.print( "Enter the quantity of item 1: " );
        quantity1 = input.nextInt();
        System.out.print( "Enter the price of item 2: " );
        price2 = input.nextDouble();
        System.out.print( "Enter the quantity of item 2: " );
        quantity2 = input.nextInt();
        System.out.print( "Enter the price of item 3: " );
        price3 = input.nextDouble();
        System.out.print( "Enter the quantity of item 3: " );
        quantity3 = input.nextInt();

        double sub = (price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        double tax = ((sub*5.5)/100);
        double total = sub*tax;

        System.out.println("Subtotal: $"+String.format("%.2f", sub));
        System.out.println("Tax: $"+tax);
        System.out.println("Total: $"+total);
        
       

        


    }
}
