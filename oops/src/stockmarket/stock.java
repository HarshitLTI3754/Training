package stockmarket;

public class stock implements exchange {

	@Override
	public void getquote() {
		System.out.println("getting quote");
	}

	@Override
	public void viewquote() {
		System.out.println("viewing quote");

	}

	@Override
	public void setquote() {
		System.out.println("setting quote");

	}

}
