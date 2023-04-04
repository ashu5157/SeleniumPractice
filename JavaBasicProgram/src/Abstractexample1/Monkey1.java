package Abstractexample1;

 public abstract class Monkey1 {
	public abstract void animalname();
	public void sleep() {
		
	}
}
abstract class doggy extends Monkey1{
	public void wakeup(){
		System.out.println("ABC");
	}
}
abstract class cat extends Monkey1{
	public void wakeup() {
		System.out.println("EFGH");
	}
}
	class abstr{
		public static void main(String[] args) {
			doggy d1=new doggy();
			d1.wakeup();
		}
	}


