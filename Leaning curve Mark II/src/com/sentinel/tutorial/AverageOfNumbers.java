package com.sentinel.tutorial;

import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	while (true) {
	    System.out.println("Input a number");
	    int command = Integer.valueOf(scanner.nextLine());
	    if (command == 4) {
		break;
	    }

	    System.out.println("You input " + command);
	}

	System.out.println("Done, thank you!");
    }

}
