package com.sentinel.tutorial;

import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	System.out.println("How many times?");
	int command = Integer.valueOf(scanner.nextLine());
	int start = 0;
	int end = command;

	for (int i = start; i < end; i++) {
	    printText();

	}
    }

    public static void printText() {
	System.out.println("In a hole in the ground there lived a method");
    }
}
