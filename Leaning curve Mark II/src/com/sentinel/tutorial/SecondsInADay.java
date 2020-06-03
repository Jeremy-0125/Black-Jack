package com.sentinel.tutorial;

import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give a number of days:");
	int number = Integer.valueOf(scanner.nextLine());
	System.out.println("You gave " + number);
	int calculationWithParatheses = (((number * 24) * 60) * 60);
	int num = number * 24 * 60 * 60;
	System.out.println(num);
    }

}
