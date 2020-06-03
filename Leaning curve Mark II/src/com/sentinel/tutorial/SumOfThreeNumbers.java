package com.sentinel.tutorial;

import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give the first number:");
	int first = Integer.valueOf(scanner.nextLine());
	System.out.println("Give the second number:");
	int second = Integer.valueOf(scanner.nextLine());
	System.out.println("Give the third number:");
	int third = Integer.valueOf(scanner.nextLine());
	double num = (double) (first + second + third) / 3;
	System.out.println(num);
    }

}
