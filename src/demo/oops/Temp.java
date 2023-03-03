package demo.oops;
//constuctor   scenarios

public class Temp {
		
	
					Temp(){
						  this(5);
						
						System.out.println("The default costructor");
					}	
					
					Temp(int x){
						 this(5, 15);
						System.out.println(x);
					}
					
					Temp(int x ,int y){
						 System.out.println(x * y);
					}
						
			public static void main(String []args) {
				new Temp();
			}
}
