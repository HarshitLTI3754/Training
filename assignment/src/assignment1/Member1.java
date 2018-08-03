package assignment1;

public class Member1 {

	private String name;
	private int age;

	public Member1() {
		super();

	}

	public Member1(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	void print(){
		System.out.println("name "+name+" "+"age "+age);
	}

	public static void main(String[] args) {
		Member1 m1 = new Member1("rishi", 12);
		m1.print();
		Member1 m2 = new Member1();
		m2.print();
	}
	

}
