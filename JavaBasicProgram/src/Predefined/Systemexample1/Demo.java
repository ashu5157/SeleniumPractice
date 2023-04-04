package Predefined.Systemexample1;

	class Demo {
		 void display() {
			 System.out.println("display method");
		 }
		 void calling() {
			 System.out.println("calling method");
		 }
		 Demo(){
			 System.out.println("void method");
		 }
	 }
		 class staticrefrence{
			 static final Demo d1=new Demo();
			 static int age=55;
			 static void calling() {
				 System.out.println("callingssss");
		 }
			 void test() {
				 System.out.println("test method");
			 }
		public static void main(String[] args) {
			Demo d2=new Demo();
			d2.display();
			d2.calling();
			staticrefrence s1=new staticrefrence();
			s1.test();
			s1.calling();
			System.out.println(staticrefrence.age);
			staticrefrence.d1.display();
			staticrefrence.d1.calling();
			System.err.println("system class");
			
		}

		 }

