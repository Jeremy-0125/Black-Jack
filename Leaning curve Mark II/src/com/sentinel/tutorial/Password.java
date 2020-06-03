package com.sentinel.tutorial;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	System.out.println("Password?");

	String message = scanner.nextLine();

	if (message.equals("Caput Draconis")) {
	    System.out.println("Welcome!");
	} else {
	    System.out.println("Off with you!");
	}
    }

}
