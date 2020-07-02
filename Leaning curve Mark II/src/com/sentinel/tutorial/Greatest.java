package com.sentinel.tutorial;

public class Greatest {

    public static int smallest(int number1, int number2) {
	if (number1 < number2) {
	    return number1;
	} else if (number1 > number2) {
	    return number2;
	} else {
	    return number1;
	}
    }

    public static void main(String[] args) {
	int answer = smallest(7, 2);
	System.out.println("Smallest: " + answer);
    }
}
