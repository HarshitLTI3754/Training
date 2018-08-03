package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class customerreflection {
	public static void main(String args[]) {
		customer c1 = new customer("xyz");
		System.out.println(c1);

		Class cc = c1.getClass();
		System.out.println(cc);

		System.out.println("-- list of constructors");
		Constructor[] constructors = cc.getConstructors();
		for (Constructor c : constructors) {
			System.out.println(c);

			System.out.println("-- list of methods");
			Method[] methods = cc.getMethods();
			for (Method m : methods) {
				System.out.println(m);
			}
			System.out.println("-- list of declared methods");
			Method[] decmethods = cc.getDeclaredMethods();
			for (Method m : decmethods) {
				System.out.println(m);
			}
			System.out.println("-- list of fields");

			Field[] fields = cc.getDeclaredFields();
			for (Field f : fields) {
				System.out.println(f);
			}
		}
//		c1.print();  error
	}
	
}
