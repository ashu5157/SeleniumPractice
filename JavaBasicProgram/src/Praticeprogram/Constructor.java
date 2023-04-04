
package Praticeprogram;

public class Constructor {
 Constructor (){
	 System.out.println("zero para");
 }
 Constructor (int a){
	 a=7;
	 System.out.println(a);
 }
 Constructor (int a,int b){
	 int res=8+7;
	 System.out.println(res);
 }
	public static void main(String[] args) {
		Constructor  c1=new Constructor ();
		Constructor  c2=new Constructor (6);
		Constructor  c3=new Constructor (6,9);
		
	}
	}


