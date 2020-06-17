package com.sentinel.tutorial;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	while (true) {
	    System.out.println("Give a number");

	    int command = Integer.valueOf(scanner.nextLine());

	    if (command == 0) {
		break;
	    } else if (command < 0) {
		System.out.println("Unsuitable Number");
	    } else if (command > 0) {
		int product = command * command;
		System.out.println(product);
	    }

	}

    }

}
