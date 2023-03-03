package demo.oops;

import java.io.EOFException;
import java.io.IOException;
import java.sql.SQLException;

class sub2 {
	
	 void m1() throws Exception {
		 System.out.println("parent class m1");
	 }
	 
}

public class Overriding_RuleFor_Exception extends sub2 {

	void m1()   {
		System.out.println("child class m1");
	}
	public static void main(String[] args)  {
		
		Overriding_RuleFor_Exception t = new Overriding_RuleFor_Exception();
		
		
	}

}
