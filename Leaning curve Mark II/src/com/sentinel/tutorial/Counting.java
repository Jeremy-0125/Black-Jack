package com.sentinel.tutorial;

import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("Input a number");
	int command = Integer.valueOf(scanner.nextLine());

	int start = 0;
	int end = command + 1;
	for (int i = start; i < end; i++) {
	    System.out.println(i);
	}
    }

}
