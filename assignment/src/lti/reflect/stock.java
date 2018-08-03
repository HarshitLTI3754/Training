package lti.reflect;

public class stock  {

	String a;
	private static stock obj;

	private stock() {
		a = "Here is The way";
	}

	public static stock getInstance() {
		if (obj == null) {
			obj = new stock();
		}
		return obj;

	}

	public static void main(String a[]) {
		stock st = stock.getInstance();
		stock st1 = stock.getInstance();
		stock st2 = stock.getInstance();
		st1.a = (st1.a).toLowerCase();
		System.out.println(st.a);
		System.out.println(st1.a);
		System.out.println(st2.a);

		st1.a = (st1.a).toUpperCase();
		System.out.println(st.a);
		System.out.println(st1.a);
		System.out.println(st2.a);

	}
}