package com.sentinel.tutorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("What is the last number?");
	int command = Integer.valueOf(scanner.nextLine());

	int number = 0;
	int product = 1;

	int start = 1;
	int end = command + 1;
	for (int i = start; i < end; i++) {

	    product = i * product;
	}
	System.out.println("The product is " + product);

    }

}
