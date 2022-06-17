package com.aayush;

import java.util.Arrays;

public class ParameterPassing {

	public static void main(String[] args) {
		
		/*
		 * In pass by value, the parameter value copies to another variable 
		 * In pass by reference, the actual parameter passes to the method
		 * In java everything is passed by value
		 */
		
		int i = 10;
		
		changeIntValue(i);
		System.out.println("i after changeIntValue():\t" + i);
		
		i = changeInt(i);
		System.out.println("i after changeInt():\t\t" + i);
		
		int[] array = {1,2,3};
		
		System.out.println("array before changeArray():\t" + Arrays.toString(array));
		changeArray(array);
		System.out.println("array after changeArray():\t" + Arrays.toString(array));
		
		clearArray(array);
		System.out.println("array after clearArray():\t" + Arrays.toString(array));
	}
	
	private static void changeIntValue(int i) {
		i+=100;
		
	}
	
	private static int changeInt(int i) {
		i +=100;
		return i;
		
	}
	
	private static void changeArray(int[] array) {
		array[1] = 200;
		
	}
	
	private static void clearArray(int[] array) {
		array = null;
		
	}

}
