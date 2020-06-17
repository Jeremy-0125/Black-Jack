package com.sentinel.tutorial;

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	while (true) {
	    System.out.println("Carry on?)");
	    String input = scanner.nextLine();
	    if (input.equals("no")) {
		break;
	    }

	}

	System.out.println("Done!");
    }

}
