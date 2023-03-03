package com.prowings.overloading;

public class MainClass {
	static void method(Integer i) {
		System.out.println(1);
	}

	static void method(int d ) {
		System.out.println(2);
	}
	
	static void method(int... i) {
		System.out.println(4);
	}

	static void method(Object o) {
		System.out.println(5);
	}

	public static void main(String[] args) {

	/*	Integer b= null;

	method(b);
		 	*/

	method();
	}



}
