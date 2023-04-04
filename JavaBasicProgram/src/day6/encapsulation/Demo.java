package day6.encapsulation;

class Demo {
	private int empID = 1000;
	private double salary = 45000;

	public int getEmpID() {
		return empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpId(int empID) {
		this.empID = empID;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Encapu1 {
	public static void main(String[] args) {
		Demo d1 = new Demo();
		System.out.println(
				"Accessing private data member outside the class using getter concept- empID: " + d1.getEmpID());
		System.out.println("Accessing private memeber of outside the class salary:" + d1.getSalary());
		System.out.println("*******updating ****************");
		d1.setEmpId(1001);
		d1.setSalary(50000);
		System.out.println("updated private member by suing set method EmpId:" + d1.getEmpID());
		System.out.println("updated private member by using set method Salary:" + d1.getSalary());
		Demo d2 = new Demo();
		System.out.println("accessing private member EmpID:" + d2.getEmpID());
		System.out.println("accessing private member Salary:" + d2.getSalary());
		Demo d3 = new Demo();
		System.out.println("accessing private member EmpID:" + d3.getEmpID());
		System.out.println("accessing private member Salary:" + d3.getSalary());
		d1.setEmpId(10002);
		d1.setSalary(60000);
		System.out.println("updated private member by suing set method EmpId:" + d1.getEmpID());
		System.out.println("updated private member by using set method Salary:" + d1.getSalary());
	}
}
