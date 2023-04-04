package day6.Arrays;

 class Example1 {
	 int age;
	 double salary;
	 Example1(){
		 System.out.println("Mango");
	 }
	 Example1(int a){
		 age=a;
		 System.out.println("Apple");
	 }
    Example1(double b){
    	salary=b;
    	System.out.println("Orange");
    }
    void calling () {
    	System.out.println("calling from Example1 age:"+age);
    	System.out.println("calling from Example1 salary :"+salary);
    }
 }
 class arrry{
	public static void main(String[] args) {
		System.out.println("*****************");
		Example1 e1=new Example1();
		Example1 e2=new Example1(27);
		Example1 e3=new Example1(26000);
		e1.calling();
		e2.calling();
		e3.calling();
		System.out.println("*****************");
		Example1[] e=new Example1[3];
		e[0]=new Example1();
		e[1]=new Example1(27);
		e[2]=new Example1(26000);
		System.out.println("**************");
		e[0].calling();
		e[1].calling();
		e[2].calling();
		
		

	}

}
