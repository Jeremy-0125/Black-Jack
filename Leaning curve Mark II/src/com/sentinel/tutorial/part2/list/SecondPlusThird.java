package com.sentinel.tutorial.part2.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	ArrayList<Integer> numList = new ArrayList<>();
	while (true) {
	    System.out.println("Input a number");
	    int command = Integer.valueOf(scanner.nextLine());
	    if (command == 0) {
		break;

	    }
	    numList.add(command);

	}

	System.out.println(numList.get(2) + numList.get(1));
    }

}
