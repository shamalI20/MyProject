package com.simplilearn.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {

		// mutable string
		StringBuilder message = new StringBuilder("Today is a good day!");

		System.out.println(message);

		// append new string text
		message.append(" Happy learning !");
		System.out.println(message);

		// replace text
		message.replace(0, 1, "t");
		System.out.println(message);

		// delete text
		message.delete(0, 2);
		System.out.println(message);

		// insert text
		message.insert(0,  "Welcome, ");
		System.out.println(message);

	}

}
