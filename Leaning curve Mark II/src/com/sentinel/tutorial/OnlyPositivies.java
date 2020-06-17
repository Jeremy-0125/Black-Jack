package com.sentinel.tutorial;

import java.util.Scanner;

public class OnlyPositivies {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	int numbers = 0;
	int sum = 0;

	while (true) {
	    System.out.println("Input a number");
	    int command = Integer.valueOf(scanner.nextLine());
	    if (command == 0) {
		break;
	    }

	    sum = command + sum;
	    numbers = numbers + 1;
	}
	double product = ((double) sum / numbers);
	System.out.println(product);
    }

}
