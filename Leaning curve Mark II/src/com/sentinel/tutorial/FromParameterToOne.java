package com.sentinel.tutorial;

public class FromParameterToOne {
    public static void main(String[] args) {
	printUntilNumber(5);

    }

    private static void printUntilNumber(int number) {
	for (int i = number; i > 0; i--) {
	    System.out.println(i);
	}
    }
}
