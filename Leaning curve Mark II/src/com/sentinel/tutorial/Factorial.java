package com.sentinel.tutorial;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("What is the last number?");
	int command = Integer.valueOf(scanner.nextLine());

	int number = 0;
	int sum = 0;

	int start = 0;
	int end = command + 1;
	for (int i = start; i < end; i++) {

	    int product = i * sum;
	}
	System.out.println("The product is " + product);

    }

}
