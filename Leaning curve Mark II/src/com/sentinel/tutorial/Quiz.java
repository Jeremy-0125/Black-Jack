package com.sentinel.tutorial;

public class Quiz {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	int number = 0;

	while (true) {
	    number = number + 1;

	    if (number >= 5) {
		break;
	    }

	    if (number < 5) {
		continue;
	    }

	    System.out.print(number + " ");
	}

	System.out.print(number + " ");
    }
}
