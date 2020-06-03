package com.sentinel.tutorial;

import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	System.out.println("Give a number:");
	String message = scanner.nextLine();
	double value = Double.valueOf(message);

	System.out.println("You wrote " + value);
    }

}
