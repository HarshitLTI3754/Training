
public class executive extends Employee {
	private double bonus;

	public executive() {
	}

	public executive(int empno, String empname, double salary, double bonus) {
		super(empname, salary);
		this.bonus = bonus;
	}

	@Override
	public void employee() {
		super.employee();
		System.out.println("Bonus: " + bonus);
	}

	@Override
	public double getsalary() {
		return super.getsalary() + bonus;
	}

}
