
public class Employee {

	private int empno;
	private String empname;
	private double salary;
    private static int autogen;
	public Employee() {

	}
	
	static {
		System.out.println("Employee class loaded...");
		autogen=1001;
	}

	public Employee(String empname, double salary) {
		this.empno = autogen ++;
		this.empname = empname;
		this.salary = salary;
	}

	public void employee() {
		System.out.println("Emp no. " + empno);
		System.out.println("Emp name " + empname);
		System.out.println("Salary : " + salary);

	}

	public double getsalary() {
		return salary;
	}

}
