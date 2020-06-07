package com.sentinel.tutorial;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner reader = new Scanner(System.in);

	System.out.println("Give a Number:");
	int number = Integer.valueOf(reader.nextLine());

	if (number % 4 == 0) {
	    System.out.println("The year " + number + " is a leap year.");
	} else {
	    System.out.println("The number " + number + " is not a leap year.");
	}
    }

}