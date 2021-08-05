package com.simplilearn.typecasting;

public class Example1 {

	public static void main(String[] args) {
		// TODO :: WAP for converting int , byte , short  => float , double , long.
		// Integer value to => Float, Double, Long.
		int i = 1000;
		float f = i;
		double d = i;
		long l = i;
		System.out.println("integer value is : "+i);
		System.out.println("integer value to float : "+f);
		System.out.println("integer value to Double: "+d);
		System.out.println("integer value to long : "+l);
		System.out.println("---------------------------");
		
		// Integer value to => Float, Double, Long.
		byte by = 100;
		float flo = by;
		double dou = by;
		long lo = by;
		System.out.println("Byte value is : "+by);
		System.out.println("byte value to float : "+flo);
		System.out.println("Double value to Double: "+dou);
		System.out.println("Long value to long : "+lo);
		
		
	}

}
