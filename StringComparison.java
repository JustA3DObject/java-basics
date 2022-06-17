package com.aayush;

public class StringComparison {

	public static void main(String[] args) {
		
		String s1 = " hello ";
		String s2 = " hello ";
		System.out.println("s1 == s2: " + (s1 == s2));	//s1 & s2 are referencing to same
														//object in string pool
		
		String s3 = new String(" hello ");	
		System.out.println("s1 == s3: " + (s1 == s3));	//s3 is referencing to a new object
		System.out.println("s1.equals(s3): " + (s1.equals(s3)));
		System.out.println("s1 == s3.intern(): " + (s1 == s3.intern()));
		
		String name1 = "Alpha";
		String name2 = "alpha";
		System.out.println("name1.equals(name2): " + name1.equals(name2));
		System.out.println(("name1.equalsIgnoreCase(name2): " + name1.equalsIgnoreCase(name2)));
		
	}

}
