package com.prowings.ExceptionHandling;

import java.util.Scanner;

class Well_length extends RuntimeException{
	
		public Well_length(String msg) {
			super(msg);
		}
}



public class WellToodeep {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int length =sc.nextInt();
		
		if(length >500) {
			
			throw new Well_length("Well is too deep");
		}
		else {
			System.out.println("Well is not deep");
		}
	}

}
