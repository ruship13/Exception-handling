package com.demo.exeption;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("statement1");
			System.out.println("statement2");
			System.out.println("statement3");
		}
		catch(RuntimeException e) {
			System.out.println("statement4");
			
		}
		finally {
          System.out.println("satement5 ");			
			
		}
        System.out.println("satement6 "+(10/0));			

	}

}
