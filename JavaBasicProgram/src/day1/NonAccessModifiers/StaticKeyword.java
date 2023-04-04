package day1.NonAccessModifiers;

public class StaticKeyword {
//static method
	static void mystatickeyword() {
		System.out.println("static method canbe called without creating obj");
	}
	//public method
	public void mypublicmethod() {
		System.out.println("public method musr me called by creating obj");
	}
	public static void main(String[] args) {
		mystatickeyword();
		StaticKeyword myobj=new StaticKeyword();
		myobj.mypublicmethod();
		
	}

}
