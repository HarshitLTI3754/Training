
public class testme {

	public static void main(String[] args) {

		Employee e1 = new Employee("Polo", 5000);
		e1.employee();

		manager mgr = new manager("lili", 7000, 200);
		mgr.employee();
		showsalary(mgr);

		executive exe = new executive(103, "mili", 9000, 300);
		exe.employee();
		showsalary(exe);

	}

	private static void showsalary(Employee emp)
	{
		//System.out.println("employee salary  " + emp.getsalary());
		
		if(emp instanceof manager)
		{
			System.out.println("manager salary  " + emp.getsalary());
		}
		else
		{
			System.out.println("executive salary  " + emp.getsalary());
		}
		
	}
	/*
	private static void showsalary(executive exe) {
		System.out.println("executive salary  " + exe.getsalary());
	}

	private static void showsalary(manager mgr) {
		System.out.println("manager salary  " + mgr.getsalary());
	}
*/
}
