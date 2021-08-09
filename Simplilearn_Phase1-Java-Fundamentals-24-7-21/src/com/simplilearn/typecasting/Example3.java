package com.simplilearn.typecasting;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO :: WAP for string to number value (byte , short , int, long double , float)
        // collect user input from console -> 
		
		//int userInput = input.nextInt();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number vaule");
		int userInput = input.nextInt();
		byte b = (byte) userInput;
		short s = (short) userInput;
		int i = userInput;
		long l = userInput;
		double d = userInput;
		float f = userInput;
		
		System.out.println("User input to bytecode is : "+ b);
		System.out.println("User input to short is : "+ s);
		System.out.println("User input to Integer is : "+ i);
		System.out.println("User input to Long  is : "+ l);
		System.out.println("User input to double is : "+ d);
		System.out.println("User input to float is : "+ f);
		
		
		
		
		
	}

}
