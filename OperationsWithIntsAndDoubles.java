package com.aayush;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntsAndDoubles {

	public static void main(String[] args) {
		int i = 20;
		System.out.println(i/3);
		System.out.println(i - (6*3));
		System.out.println((double)i/3);
		
		BigDecimal val = BigDecimal.valueOf(20).setScale(2);
		BigDecimal divisor = BigDecimal.valueOf(3);
		BigDecimal quotent = val.divide(divisor, RoundingMode.HALF_UP);
		System.out.println(quotent);
		
		double d1 = 3.1;
		double d2 = 1.21;
		
		System.out.println(d1 - d2);
		
		BigDecimal bigd1 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bigd2 = BigDecimal.valueOf(1.21).setScale(2);
		System.out.println(bigd1.subtract(bigd2));
	}

}
