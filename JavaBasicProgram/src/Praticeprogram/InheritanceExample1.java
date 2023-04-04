package Praticeprogram;
class Car  {
	 void show() {
		 System.out.println("I am Car");
	 }
}
class scotty extends Car{
	 void show() {
		 System.out.println("I M SCOTTY");
	 }
}
	 class honda extends Car{
		 void show() {
		 System.out.println("i am honda");
	 }
}
public class InheritanceExample1 {
	public static void main(String[] args) {
	scotty s1=new scotty();
		s1.show();
		

	}


}

