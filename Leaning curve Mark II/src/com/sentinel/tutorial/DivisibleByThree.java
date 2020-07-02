package com.sentinel.tutorial;

public class DivisibleByThree {
    public static void main(String[] args) {
	divisibleByThreeInRange(3, 6);

    }

    private static void divisibleByThreeInRange(int start, int end) {

	for (int i = start; i < end + 1; i++) {

	    if (i % 3 == 0) {
		System.out.println(i);
	    }

	}
    }
}
