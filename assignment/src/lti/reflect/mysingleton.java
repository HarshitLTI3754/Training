package lti.reflect;

public class mysingleton {
	String a;
	private static mysingleton obj;

	private mysingleton() {
		a = "Here is The way";
	}

	public static mysingleton getInstance() {
		if (obj == null) {
			obj = new mysingleton();
		}
		return obj;

	}

	

	public static void main(String a[]) {
		mysingleton st = mysingleton.getInstance();
		mysingleton st1 = mysingleton.getInstance();
		mysingleton st2 = mysingleton.getInstance();
		st1.a=(st1.a).toLowerCase();
		System.out.println(st.a);
		System.out.println(st1.a);
		System.out.println(st2.a);
		
		st1.a=(st1.a).toUpperCase();
		System.out.println(st.a);
		System.out.println(st1.a);
		System.out.println(st2.a);
	

		
		


	}
}
