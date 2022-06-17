package com.aayush;

public class MathClassUse {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.max(3, 5));
		System.out.println(Math.min(3, 5));
		System.out.println(Math.sqrt(4));
		System.out.println(Math.abs(-5));

		System.out.println(Math.sqrt(-1));
		System.out.println(0/0.0);
		System.out.println((0/0.0)+5);
		
		System.out.println(5/0.0);
		System.out.println(-5/0.0);
		
		System.out.println(Math.round(20.0/3.0));
		System.out.println(Math.round(20*100/3.0)/100.0);
		
		System.out.println(Math.random());					//between 0.0 and 1.0 					
		System.out.println((int)(Math.random()*100));		//between 0 and 100
		System.out.println((int)(Math.random()*100)+100);	//between 100 and 200
	}

}
