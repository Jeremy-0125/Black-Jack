package com.sentinel.tutorial;

import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner reader = new Scanner(System.in);

	int first = Integer.valueOf(reader.nextLine());
	int second = Integer.valueOf(reader.nextLine());

	if (first > second) {
	    System.out.println(first + " is greater than " + second);
	} else if (second > first) {
	    System.out.println(first + " is less than " + second);

	} else if (first == second) {
	    System.out.println(first + " equal to " + second);

	}
    }

}