package com.aayush;

public class StringFormatting {

	public static void main(String[] args) {
		
		String name = "Alpha";
		String greetingsTemplate = "Hello %s! Good %s!";
		String morning = "Morning";
		String afternoon = "Afternoon";
		String evening = "Evening";
		String formattedString = String.format(greetingsTemplate, name, morning);
		System.out.println(formattedString);
		
		int n = 10;		
		System.out.printf("You have %d tasks left.\n", n);
	}

}
