package abstractionexample;
abstract class Watches{
	abstract void show(); 
}
class Titan extends Watches{
	void show() {
		System.out.println("i am Titan");
	}
}
class Cashio extends Watches{
	void show() {
		System.out.println("I AM CASHIO");
	}
}
public class Example1 {
	public static void main(String[] args) {
		Cashio c1=new Cashio();
			c1.show();
			
			Titan t1=new Titan();
			t1.show();
			 Watches w1=new Titan();
			 w1.show();
			 Watches w2=new Cashio();
			 w2.show();
	}

}
