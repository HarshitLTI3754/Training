package assignment;

public class Person implements Cloneable{

	private String name;
	private int age;

	public Person() {
		this("abc", 10); // constructor chaining
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println("Name: " + name + "\tAge : " + age);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "\tAge : " + age;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (this.name.equals(p.name) && age == p.age)
				return true;
		}
		return false;
	}

	public static void main(String args[]) throws CloneNotSupportedException {
		Person p1 = new Person("roham",12);
		Person pc=(Person)p1.clone();

		// Person p = null;
		// for (int c = 1; c <= 1000; c++) {
		// p = new Person();
		// System.gc();
		// System.out.println(count);
	}

	

	@Override
	public void finalize() throws Throwable {
		System.out.println("NO More");

	}

}
