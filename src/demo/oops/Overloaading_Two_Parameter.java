package demo.oops;

public class Overloaading_Two_Parameter  {
	static void add(int a ,int  b ) {System.out.println("int int Result :"); }
	static void add(long a,long b) {System.out.println(" long long Result :");}
	
	static void add(int a ,long b) {System.out.println("int long Result :");}
	static void add(long a,int b) {System.out.println("long int Result :");}
	
	static void add(int a,Integer b) {System.out.println("int IntegerWc Result :");}
	static void add(Integer a,int b) {System.out.println("integerWc int Result :");}
	
	static void add(Integer a,Integer b) {System.out.println("Integer Integer Result :");}
	static void add(Long a,Long b) {System.out.println("Longwc Longwc Result :");}
	
	static void add(Number a,Integer b) {System.out.println("NumberWc NumberWc Result :");}
	static void add(Integer a ,Number b) {System.out.println("IntegerWc NumberWc Result :");}
	
	static void add(Object b) {System.out.println("*************IntegerWc NumberWc Result :");}
	static void add(String b) {System.out.println("*****IntegerWc NumberWc Result :");}
	
	
	public static void main(String[] args) {
		int x=10;
		int y=20;
		
	}
}
