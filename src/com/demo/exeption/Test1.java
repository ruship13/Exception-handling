package com.demo.exeption;

public class Test1 extends RuntimeException{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	throw new ArithmeticException("server unreachable");
	
		
		// we can use throw keyword only for throwable types otherwise we will get CE
		//throw  new ThrowKeyWordExe();

		
		// using throwable type
		
		throw new Test1();
	}

}
