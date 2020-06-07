package com.sentinel.tutorial;

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give points [0-100]");
	int number = Integer.valueOf(scanner.nextLine());

	if (number < 5000) {
	    System.out.println("No Tax.");
	} 
	
	else if (number <= 25000){
	    ( 100 + (number - 5000)* 0.08)
	    System.out.println("Tax: " + number);
	}
	
	else if (number <= 55000) {
	    ( 1700 + (number - 25000)* 0.1)
	    System.out.println("Tax: " + number);
	} 
	
	else if (number <= 200000) {
	    ( 4700 + (number - 55000)* 0.12)
	    System.out.println("Tax: " + number);
	} 
	
	else if (number <= 1000000) {	 
	    ( 22100 + (number - 200000)* 0.15)
	    System.out.println("Tax: " + number);
	}
	
	else if (number >= 1000000) {
	    ( 142100 + (number - 1000000)* 0.17)
	    System.out.println("Tax: " + number);
	}
    }

}
