package com.aayush;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input: ");
		String input = sc.next();
		System.out.println("You entered: " + input);
		System.out.print(("Enter an integer: "));
		int i = sc.nextInt();
		System.out.println("You entered: " + i);
	}

}
