package com.sentinel.tutorial;

import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);
	System.out.println("Input 2 numbers");
	int first = Integer.valueOf(scanner.nextLine());
	int second = Integer.valueOf(scanner.nextLine());

	int start = first;
	int end = second + 1;
	for (int i = start; i < end; i++) {
	    System.out.println(i);
	}
    }

}
