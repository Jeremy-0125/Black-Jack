package com.sentinel.tutorial;

import java.util.Scanner;

public class RandomQuiz {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner x = new Scanner(System.in);
	System.out.print("Customer number: ");
	int y = Integer.valueOf(x.nextLine());

	if (y >= 1000 && y % 25 == 0) {
	    System.out.println("Gets a gift card!");
	} else if (y % 2000 == 0) {
	    System.out.println("Gets a large gift card!");
	} else {
	    System.out.println("Gets nothing.");
	}

    }

}
