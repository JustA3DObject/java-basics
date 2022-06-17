package com.aayush.enums;

public class Enums {

	public static void main(String[] args) {
		
		PriorityEnum priority = PriorityEnum.HIGH;
		
		switch (priority) {
		case HIGH: 
			System.out.println("High Priority");
			break;
		case MEDIUM: 
			System.out.println("Medium Priority");
			break;
		case LOW: 
			System.out.println("Low Priority");
			break;
		}
		
		PriorityEnum priority2 = PriorityEnum.valueOf("HIGH");
		
		System.out.println("Enum valueOf(): " + priority2);
		
//		priority2 = PriorityEnum.valueOf("high"); //error because high is not in enum, HIGH is
		
		System.out.println("PriorityEnum.HIGH == PriorityEnum.MEDIUM: " + (PriorityEnum.HIGH == PriorityEnum.MEDIUM));
		System.out.println("PriorityEnum.HIGH == PriorityEnum.HIGH: " + (PriorityEnum.HIGH == PriorityEnum.HIGH));
		
		System.out.println("PriorityEnum.HIGH.ordinal(): " + PriorityEnum.HIGH.ordinal());
		System.out.println("PriorityEnum.MEDIUM.ordinal(): " + PriorityEnum.MEDIUM.ordinal());
		
		PriorityEnum[] values = PriorityEnum.values();
		for (PriorityEnum priority3 : values) {
			System.out.println(priority3);
		}
	}

}
