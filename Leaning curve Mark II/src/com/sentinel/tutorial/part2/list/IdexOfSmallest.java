package com.sentinel.tutorial.part2.list;

import java.util.ArrayList;
import java.util.Scanner;

public class IdexOfSmallest {

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
	Scanner scanner1 = new Scanner(System.in);
	System.out.println("Search for: ");

	int first = Integer.valueOf(scanner1.nextLine());

	for (int i = 0; i < numList.size(); i++) {
	    int number = numList.get(i);
	    if (first == number) {
		System.out.println(first + " is at idex " + i);
	    }

	}
    }
}