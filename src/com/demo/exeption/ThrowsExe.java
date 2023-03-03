package com.demo.exeption;

public class ThrowsExe {

	public static void main(String[ ] args)  throws Exception{
		dostuff();
	}
		public static void dostuff()   {
			try {
		domorestuff();	
			}
			catch(Exception e){
			}
		}
public static void domorestuff() throws Exception {
		System.out.println("hello");
		Thread.sleep(1000);
	}
}
