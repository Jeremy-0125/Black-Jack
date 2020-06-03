package com.sentinel.tutorial;

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give a number:");
	int number = Integer.valueOf(scanner.nextLine());
	if (number >= 0) {
	    System.out.println("Your number is positive.");
	} else {
	    System.out.println("Your number is negative.");
	}
    }

}
