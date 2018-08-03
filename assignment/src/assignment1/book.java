package assignment1;

public class book {
	static String title;
	boolean issuebook;
	static boolean state;

	public boolean isIssuebook() {
		return issuebook;
	}

	public void setIssuebook(boolean issuebook) {
		this.issuebook = issuebook;
		if (state = true)
			if (issuebook = true) {
				System.out.println("no books left with title " + title);
				System.out.println("wait for " + member.name);
			} else {
				state=false;
				setIssuebook(state);
			}
	}

	public book(String tit) {
		this.title = tit;
	}
}
