package com.sentinel.tutorial;

import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give points [0-100]");
	int points = Integer.valueOf(scanner.nextLine());

	if (points < 0) {
	    System.out.println("Impossible.");
	} else if (points <= 49) {
	    System.out.println("Failed");
	} else if (points <= 59) {
	    System.out.println("1");
	} else if (points < 69) {
	    System.out.println("2");
	} else if (points < 79) {
	    System.out.println("3");
	} else if (points < 89) {
	    System.out.println("4");
	} else if (points < 100) {
	    System.out.println("5");
	} else if (points > 100) {
	    System.out.println("Incredible!");
	}
    }

}
