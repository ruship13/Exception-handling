package com.prowings.ExceptionHandling;

import java.util.Scanner;

class Bike_Kilometer extends RuntimeException
{
	public Bike_Kilometer(String msg) {
		super(msg);
	}
}
public class Bike {

	public static void main(String[] args) {
		Scanner km = new  Scanner(System.in);
		System.out.println("Enter the kilometers");
		int k=km.nextInt();
		if(k>2000) {
			throw new Bike_Kilometer("pls change your bikes engine oil");
		}
		else {
			System.out.println("not need to change the oil");
		}		
	}

}
