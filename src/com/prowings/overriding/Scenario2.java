package com.prowings.overriding;

class sc{
	public static void m1() {
		System.out.println("fegrth");
	}
}

class Scenario2 extends sc
{
  /*  void myMethod() throws IOException
    {
        System.out.println("ONE");
    }
 
    void myMethod() throws NumberFormatException
    {
        System.out.println("TWO");
    }
 
    void myMethod() throws ArrayIndexOutOfBoundsException
    {
        System.out.println("THREE");
    }*/
	public static void m1() {
		System.out.println("*");
	}
	public static void main(String[] args) {
		sc p=new sc();
		p.m1();
		System.out.println(p);
		}
}
