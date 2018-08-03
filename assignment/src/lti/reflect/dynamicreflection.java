package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class dynamicreflection {

	public static void main(String args[]) throws Exception {
		String qcn = "lti.reflect.customer";

		// manually loading the class

		Class custClass = Class.forName(qcn);

		// Instantiating with parameterised constructor
		Constructor custConst = custClass.getConstructor(String.class);

		// Instantiating with parameterised constructor

		Object obj = custConst.newInstance("xyz");
		System.out.println(obj);

		// Getting the private method of class

		Method printmethod = custClass.getDeclaredMethod("print", null);

		// Calling print method on customer object

		printmethod.setAccessible(true);
		printmethod.invoke(obj, null);
	}

}
