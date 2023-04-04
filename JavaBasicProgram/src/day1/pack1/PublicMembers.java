package day1.pack1;

public class PublicMembers {
	public int accNum = 4321;

	public void displayAccNum() {
		System.out.println("Acc Number:" + accNum);
	}

	public static void main(String[] args) {
		PublicMembers p1 = new PublicMembers();
		p1.displayAccNum();
		System.out.println(p1.accNum);
	}
}

class AccessPublicMembers {
	public static void main(String[] args) {
		PublicMembers p1 = new PublicMembers();
		p1.displayAccNum();
		System.out.println(p1.accNum);

	}
}
