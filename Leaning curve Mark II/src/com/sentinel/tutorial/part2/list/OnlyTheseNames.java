package com.sentinel.tutorial.part2.list;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNames {

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
	System.out.println("Input 2 numbers");
	int first = Integer.valueOf(scanner1.nextLine());
	int second = Integer.valueOf(scanner1.nextLine());

	int start = first;
	int end = second;

	for (int i = start; i < end; i++) {
	    int number = numList.get(i);
	    System.out.println(number);
	}
    }
}
