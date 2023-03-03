package demo.oops;

abstract  class ServiceProvider implements Interf {

	 
	 public void m1() {
		 System.out.println("Rushi");
	 }

	 }
 class Test extends ServiceProvider{
	 public static void main(String[] args) {
		 Test t =new Test();
		 t.m1();
	 }

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	
	}	


