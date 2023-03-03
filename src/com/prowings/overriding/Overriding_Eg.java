package com.prowings.overriding;

public class Overriding_Eg {

	
   void m1() {
		System.out.println("inside m1 method");
			}
	
 class Rec extends  Overriding_Eg{
		
	final void  m1() {
			System.out.println("child m1 method");
			
		}
	}
	public static void main(String[] args) {
		

	}

}
