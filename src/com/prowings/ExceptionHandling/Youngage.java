package com.prowings.ExceptionHandling;

//custom Exception
	class Custom extends RuntimeException{

		Custom(String msg){
			super(msg);
		}

}
public class Youngage{
	
	public static void main(String[] args) {
		
		int age=20;
		
		if(age>18) {
			
			throw new Custom("welcome to portal");
		}
		else
		{
			System.out.println("you are not applicable");
		}
	}

}
