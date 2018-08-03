
public class EventImpl implements Event {

	@Override
	public void dosomething() {

		System.out.println("First event implementation");
	}

	public static class InnerEventImpl implements Event {

		@Override
		public void dosomething() {

			System.out.println("Second event implementation");
		}

	}

	public void doingsomething() {
		class Innermostimpl implements Event {

			@Override
			public void dosomething() {

				System.out.println("Third event implementation");
			}
		}
		;

		new Innermostimpl().dosomething();
	}

	public void doingsomethingagain() {
		Event e = new Event() {

			@Override
			public void dosomething() {
				System.out.println("Fourth event implementation");
			}
		};
		e.dosomething();
	}

	public void doingsomethingonelasttime() {
		Event e = () -> System.out.println("Fifth event implemention");
		e.dosomething();
	}

	public static void main(String args[]) {
		EventImpl impl = new EventImpl();
		impl.dosomething();

		// InnerEventImpl c=impl.new InnerEventImpl();
		// c.dosomething();

		InnerEventImpl c = new EventImpl.InnerEventImpl();
		c.dosomething();

		impl.doingsomething();
		impl.doingsomethingagain();
		impl.doingsomethingonelasttime();

	}

}
