package com.sentinel.tutorial;

import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	// Write your program here
	System.out.println("What's your name?");

	String first = scanner.nextLine();

	System.out.println("Hi " + first + "!" + "How are you?");

	String second = scanner.nextLine();

	System.out.println("That's nice. Have a nice day!");

	String third = scanner.nextLine();

	System.out.println("Goodbye.");
    }
}