package com.demo.exeption;

public class ReturnExample_Exception {
	public static void main(String[] args) {
		
	System.out.println(m1());
		}
	
	static int m1() {
		
		try {	
			System.out.println("inside try");
			return 10;
		}
		catch(Exception e) {
			System.out.println("inside catch");
			return 20;
		}
		finally {
			System.out.println("inside finally");
			return 30;
			
				}
	}

}
