package Multithreading;

public class syncdemo implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		display(name);
	}

	private Object dummy = new Object();

	private synchronized void display(String name) {

		synchronized (this) { // locking the current object
//		synchronized (dummy) {
			try {
				System.out.print("[");
				Thread.sleep(1000);
				System.out.print(name);
				Thread.sleep(1000);
				System.out.print("]");
			} catch (InterruptedException e) {

			}
			System.out.println("Thread exited");
		}
	}

	public static void main(String[] args) {
		syncdemo sd = new syncdemo();
		Thread t1 = new Thread(sd, "Alpha");
		Thread t2 = new Thread(sd, "Al");
		Thread t3 = new Thread(sd, "Alp");

		t1.start();
		t2.start();
		t3.start();
	}

}
