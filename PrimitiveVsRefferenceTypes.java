package com.aayush;

import java.util.Arrays;

public class PrimitiveVsRefferenceTypes {

	public static void main(String[] args) {
		int i1 = 128;
		int i2 = 128;
		
		System.out.println("int1 == int2: " + (i1 == i2));	//Comparing values
		System.out.println("1 == 2: " + (1 == 2));
		System.out.println("65 == 'A': " + (65 == 'A'));
		
		Integer i3 = 128;
		Integer i4 = 128;
		System.out.println("i3 == i4: " + (i3 == i4));	//comparing references not values
		
		Integer i5 = 127;
		Integer i6 = 127;
		System.out.println("i5 == i6: " + (i5 == i6));	/*two integer objects aren't created
														  value from heap memory is taken as
														  integers have range -128 to 127 */
														
		
		Integer i7 = new Integer(127);	//this is crossed out by IDE because it is rarely
		Integer i8 = new Integer(127);	//appropriate to use this constructor
		System.out.println("i7 == i8: " + (i7 == i8));	//now they are referencing different objects
		
		
		Integer i9 = Integer.valueOf(127);
		Integer i10 = Integer.valueOf(127);
		System.out.println("i9 == i10: " + (i9 == i10));
		
		System.out.println("i3.equals(i4): " + (i3.equals(i4)));
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println("arr1 == arr2: " + (arr1 == arr2));	//Arrays are reference types
		System.out.println("arr1.equals(arr2): " + (arr1.equals(arr2)));
		System.out.println("Arrays.equals(arr1,arr2): " + (Arrays.equals(arr1, arr2)));
		
		arr1 = arr2;	//both variables are pointing to same objects now
		System.out.println("arr1 == arr2: " + (arr1 == arr2));
		
	}

}
