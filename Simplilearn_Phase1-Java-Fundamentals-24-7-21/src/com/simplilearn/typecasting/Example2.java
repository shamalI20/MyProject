package com.simplilearn.typecasting;

public class Example2 {

	public static void main(String[] args) {
		// TODO WAP for converting long, float , int => byte , short, double.
		long l = 1000;
		byte b = (byte)l;
		short s =(short)l;
		double d = l;
		System.out.println("Long value is : "+l);
		System.out.println("Long value to Byte: "+b);
		System.out.println("Long value to Short is   "+s);
		System.out.println("Long value to Double is : "+d);
		
		System.out.println("-------------------");
		
		// Float converted to Byte, Short, Double.
		float lon = 10;
		byte by = (byte)lon;
		short sh =(short)lon;
		double dou = lon;
		System.out.println("Float value is : "+lon);
		System.out.println("Float value converted to Byte: "+by);
		System.out.println("Float value converted Short is : "+sh);
		System.out.println("Float value converted to Double is : "+dou);
		
		System.out.println("---------------------");
		
		// Float converted to Byte, Short, Double.
				int i = 1000;
				byte byt = (byte)i;
				short shor =(short)i;
				double doub = i;
				System.out.println("Integer value is : "+i);
				System.out.println("int value converted to Byte: "+byt); // shows default value
				System.out.println("int value converted Short is : "+shor);
				System.out.println("int value converted to Double is : "+doub);		
		
		
		
		
		

	}

}
