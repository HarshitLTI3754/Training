package stockmarket;

public class stocksinglton {
	private stocksinglton() {

	}

	static stock lti = null;

	public static stock getInstance() {
		if (lti == null) {
			lti = new stock();
		}
		return lti;

	}

}
