package com.sentinel.tutorial;

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner reader = new Scanner(System.in);

	int first = Integer.valueOf(reader.nextLine());
	int second = Integer.valueOf(reader.nextLine());

	int product = first + second;
	double squareRoot = Math.sqrt(product);
	System.out.println(squareRoot);

    }

}
