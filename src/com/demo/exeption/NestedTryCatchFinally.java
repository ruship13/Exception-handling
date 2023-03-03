package com.demo.exeption;

public class NestedTryCatchFinally {
	public static void main(String[] args) {
		try {
			System.out.println("outer try block");
					try {
						System.out.println("inner try block");
						System.out.println((10/0));
					}
					catch(NullPointerException e){
						System.out.println("inner catch block");
					}
		       }
		catch(Exception e) {
				System.out.println("outer catch block");
			 }		
		finally {
				System.out.println("outer finally block");
			}		

		}
	}
