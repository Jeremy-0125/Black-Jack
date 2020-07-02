package com.sentinel.tutorial.part2.list;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	ArrayList<Integer> numList = new ArrayList<>();
	while (true) {
	    System.out.println("Input a number or -1 to stop.");
	    int command = Integer.valueOf(scanner.nextLine());
	    if (command == -1) {
		break;

	    }
	    numList.add(command);

	}

	int sum = 0;
	double quotient = 0;

	for (int i = 0; i < numList.size(); i++) {

	    sum = numList.get(i) + sum;

	}
	quotient = sum / numList.size();
	System.out.println("Average: " + quotient);

    }
}