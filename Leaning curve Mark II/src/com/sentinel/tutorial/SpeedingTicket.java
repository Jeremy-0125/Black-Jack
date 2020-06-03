package com.sentinel.tutorial;

import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	Scanner scanner = new Scanner(System.in);

	System.out.println("Give Speed:");
	int speed = Integer.valueOf(scanner.nextLine());
	if (speed > 120) {
	    System.out.println("Speeding Ticket!");
	}
    }

}
