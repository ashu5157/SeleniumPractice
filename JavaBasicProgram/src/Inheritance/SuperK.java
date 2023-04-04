package Inheritance;
 public class SuperK{
	void show() {
		System.out.println("Super");
	}
 }
	class Dog extends SuperK{
		void animal() {
			System.out.println("Dog");
		}
	}
		class cat extends Dog{
			void animal3() {
				System.out.println("Cat");
			}
		}
class supern{
	public static void main(String args[]) {
		cat c1=new cat();
		c1.animal3();

	}
}
	
 


