package Inheritance;
class Car1  {
	 void show() {
		 System.out.println("I am Car");
	 }
}
class scotty extends Car1{
	 void show() {
		 super.show();
		 System.out.println("I M SCOTTY");
	 }
}
	 class honda extends Car1{
		 void show() {
			 super.show();
		 System.out.println("i am honda");
	 }
}
public class Car {
	public static void main(String[] args) {
	honda h1=new honda();
		h1.show();

		
	
		
	

	}


}

