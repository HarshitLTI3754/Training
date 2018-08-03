package Multithreading;

public class YieldThread {

	static class HelloThread extends Thread {

		@Override
		public void run() {

			while (true) {
				System.out.println("Hello");
				yield();
//				try {
//					sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}

			}
		}
	}

	static class WorldThread extends Thread {

		@Override
		public void run() {

			while (true) {
				System.out.println("World");
				yield();
//				try {
//					sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
	}

	public static void main(String[] args) {

		HelloThread hello = new HelloThread();
		WorldThread world = new WorldThread();

		hello.start();
		world.start();

	}

}
