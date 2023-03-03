package com.demo.exeption;

import java.util.Scanner;

 class WeatherNotFound extends RuntimeException {
public WeatherNotFound(String s) {
	super(s);
}
}

public class TestDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Temp");
		int Temp = sc.nextInt();
		
		if (Temp< 20) {
			throw new WeatherNotFound("Summer");
		}else {
			System.out.println("Winter");
		}
	}
}
