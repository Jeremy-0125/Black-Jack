package com.sentinel.tutorial.part2.list;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	ArrayList<String> wordList = new ArrayList<>();
	while (true) {
	    System.out.println("Input a name or 0 to stop.");
	    String command = String.valueOf(scanner.nextLine());
	    if (command.equals("0")) {
		break;

	    }
	    wordList.add(command);

	}

	int values = wordList.size();

	System.out.println(wordList.get(0));

	System.out.println(wordList.get(wordList.size() - 1));
    }

}
