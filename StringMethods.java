package com.aayush;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String s = " hello ";
		
		System.out.println(s);
		System.out.println("s.length(): " + s.length());
		System.out.println("s.contains(\"he\"): " + s.contains("he"));
		System.out.println("s.isEmpty: " + s.isEmpty());
		System.out.println("s.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.startsWith(\"h\"): " + s.startsWith("h"));
		System.out.println("s.ensWith(\" \"): " + s.endsWith(" "));
		System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL"));
		System.out.println("s.trim(): " + s.trim());
		System.out.println("s.strip(): " + s.strip());
		
		System.out.println("s.substring(0,3): " + s.substring(0,3));
		System.out.println("Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes()));
		System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray()));
		System.out.println("s.charAt(1): " + s.charAt(1));
		System.out.println("Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e")));
		
	}

}
