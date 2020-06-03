package com.sentinel.tutorial;

import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give a number:");
	int speed = Integer.valueOf(scanner.nextLine());
	if (speed == 1984) {
	    System.out.println("Orwell");
	}
    }

}
