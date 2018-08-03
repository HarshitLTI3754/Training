package Multithreading;

public class MyThread extends Thread{
	
	public MyThread(String name)
	{
		super(name);
	}
@Override
	public void run() {
	String name=MyThread.currentThread().getName();
			for(int c=1;c<=50;c++)
		System.out.println(name + " : "+  ++data);
	}

private int data;

	public static void main(String[] args) {
		MyThread mt1 = new MyThread("abc");
		MyThread mt2 = new MyThread("xyz");
		MyThread mt3 = new MyThread("okp");
		
		mt1.start();
		mt2.start();
		mt3.start();
		
		
		
		

	}
	

}
