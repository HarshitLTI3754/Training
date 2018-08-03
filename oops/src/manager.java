
public class manager extends Employee {

	private double commission;

	public manager() {

	}

	public manager(String empname, double salary, double commission) {
		super(empname, salary);
		this.commission = commission;
	}

	@Override
	public void employee() {
		super.employee();
		System.out.println("commission: " + commission);
	}

	@Override
	public double getsalary() {
		return super.getsalary() + commission;
	}

}
