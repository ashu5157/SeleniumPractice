package day1.PredefinedObjclass;

 class Demo {
			void display() {
				System.out.println("I am display()..");
			}
		}
		class Example12 extends Demo{
			static int last_roll = 100;
			int roll_no;
			// Constructor
			Example12()
		    {
		        roll_no = last_roll;
		        last_roll++;
		    }
			// Driver code
			public static void main(String args[]) {
				
				Demo d1=new Demo();
				System.out.println(d1);//d1.toString();--->day18.predefinedclasses.objectclass.Demo@234567DFGHJ
				Demo d3=new Demo();
				System.out.println(d3.toString());	//--->day18.predefinedclasses.objectclass.Demo@2345656kjkDFGHJ	
				System.out.println("*************************************");
				Example12 s = new Example12();
				// Below two statements are equivalent
				System.out.println(s);//java complier writes-->s.toString() -->string representation of an object--> FQCN@hexadecimaladdress
				System.out.println(s.toString());//string representation of an object
				System.out.println("***********************************");
				Demo d2=new Example12();
				System.out.println(d2);	
				System.out.println("***********************************");
				System.out.println(new Example12());
			

	}

}
