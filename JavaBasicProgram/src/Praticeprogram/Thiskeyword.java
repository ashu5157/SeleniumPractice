package Praticeprogram;
public class Thiskeyword {
int age=25;
void print (int age) {
	System.out.println(this.age);
	System.out.println(age);
}	
	
	public static void main(String[] args) {
		Thiskeyword t1=new Thiskeyword();
	t1.print(26);
	

	}

}
