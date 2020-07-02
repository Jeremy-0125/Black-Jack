package com.sentinel.tutorial.part2.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);

	ArrayList<String> wordList = new ArrayList<>();

	String first = scanner.nextLine();
	wordList.add(first);

	String second = scanner.nextLine();
	wordList.add(second);

	String third = scanner.nextLine();
	wordList.add(third);

	String four = scanner.nextLine();
	wordList.add(four);

	System.out.println(wordList.get(2));
    }

}
