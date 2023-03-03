package demo.oops;
//accesing child class objects using abstract parent class constuctor
public class Student extends Person {
	
	String student_name;
	int roll_no;
	int std_id;
	char std_division;
	int std_Standard;

	

	public Student(String student_name, int roll_no, int std_id, char std_division, int std_Standard) {
		super("he",56,6.7f,"er","rth");
		this.student_name = student_name;
		this.roll_no = roll_no;
		this.std_id = std_id;
		this.std_division = std_division;
		this.std_Standard = std_Standard;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("er",45,4,'d',9);
		System.out.println(s1.city);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
