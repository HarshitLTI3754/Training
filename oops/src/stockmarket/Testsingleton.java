package stockmarket;


public class Testsingleton {

	public static void main(String[] args) {

		holder h= stocksinglton.getInstance();
		h.viewquote();
		
		exchange e= stocksinglton.getInstance();
		e.setquote();
		
		
		broker b= stocksinglton.getInstance();
		b.getquote();
		
	}

}
