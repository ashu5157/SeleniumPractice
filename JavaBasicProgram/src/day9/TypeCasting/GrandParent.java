package day9.TypeCasting;

class GrandParent {
	void home() {
		System.out.println("grandparent home");
	}
}

class parent extends GrandParent {
	void calling() {
		System.out.println("parent calling ");
	}

	void mycell() {
		System.out.println("parent mycell");
	}
}

class child extends parent {
	void show() {
		System.out.println("child show");
	}
}

class Derivedtypecasting {
	public static void main(String args[]) {
		System.out.println("obj and ref of child class");
		child c1 = new child();
		c1.home();
		c1.calling();
		c1.mycell();
		c1.show();
		System.out.println("^^^^^^^^^^^^^^");
		parent p1 = new parent();
		p1.calling();
		p1.mycell();
		p1.home();
		GrandParent g1 = new GrandParent();
		g1.home();
		parent obj = c1;// parent obj=new child() ;
		obj.mycell();
		obj.calling();
		obj.home();

	}

}
