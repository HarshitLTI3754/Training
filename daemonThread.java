package Multithreading;

public class daemonThread extends Thread {
	private int limit;

	public daemonThread(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	@Override
	public void run() {
		String name = currentThread().getName();
		for (int c = 1; c <= limit; c++) {
			System.out.println(name + ":" + c);
		}

	}

	public static void main(String[] args) {
		daemonThread t1 = new daemonThread("geeta", 25);
		daemonThread t2 = new daemonThread("babita", 25);

		daemonThread t3 = new daemonThread("sangeeta", 25);

		daemonThread t4 = new daemonThread("sarita", 500000);
		t4.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
