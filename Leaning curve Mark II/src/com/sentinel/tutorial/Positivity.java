package com.sentinel.tutorial;

import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give a number:");
	int first = Integer.valueOf(scanner.nextLine());
	System.out.println("Give another number:");
	int second = Integer.valueOf(scanner.nextLine());
	if (first > second) {
	    System.out.println("Greater number is " + first);
	} else if (second > first) {
	    System.out.println("Greater number is " + second);
	} else if (first == second) {
	    System.out.println("The numbers are equal.");
	}
    }

}
