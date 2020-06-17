package com.sentinel.tutorial;

import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner reader = new Scanner(System.in);

	int number = Integer.valueOf(reader.nextLine());

	if (number < 0) {
	    int product = number * -1;
	    System.out.println(product);
	} else {
	    System.out.println(number);
	}
    }

}
