package demo.oops;


class Parent{
	/*abstract m1() { 																//Rule of return type
		System.out.println("Parent class m1 method");
		
	}*/
	void m2() {
		System.out.println("parent class m2 method");
	}
	void m3() {
		System.out.println("parent class m3 method");
	}
	
	/*  void m1() {																			                   // Rule for access modifier
		System.out.println("Parent Class m1 Method");
	}*/
	
}

 public  class Overriding_Practtical extends Parent {

/*	Integer m1() {																	//Rule of return type
		System.out.println("child class m1 method");
	
	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method of child class");
		Parent t = new Parent();
		//Overriding_Practtical p = new Overriding_Practtical();
	Parent p1 = new Overriding_Practtical();
		
	/*	p1.m1();
		p1.m2();
		p1.m3();*/
		//p1.m4();
		
	}

	/*void m1() {
		System.out.println("child  Class m1 Method");
	}
*/
	void m2() {
		System.out.println("child class m2 method");
	}
	void m4() {
		System.out.println("child class m4 method");
	}

}
