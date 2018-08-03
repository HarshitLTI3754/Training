package assignment;

public class emailchecker {

	public static void main(String[] args) {
		String email = "abcd@gmail.com";
		if (email.indexOf('@') >= 4 && (((email.indexOf('.')) - email.indexOf('@')) >= 3)
				&& (email.length() - email.indexOf('.') >= 2)) {

			System.out.println("Valid");
		} else {
			System.out.println("Not valid");
		}

	}

}
