package assignment1;

public class member {
	static String name;
	boolean returnbook;

	public boolean isReturnbook() {
		return returnbook;
	}

	public void setReturnbook(boolean returnbook) {
		this.returnbook = returnbook;
		if (returnbook == true) {
			System.out.println("no book is issued by the member " + name);
			System.out.println("you can issue it from bookbank");
		} else {
			System.out.println("fgfbgf");
		}
	}

	public member(String a) {
		this.name = a;
	}
}
