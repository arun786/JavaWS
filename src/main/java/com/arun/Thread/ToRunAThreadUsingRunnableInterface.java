package com.arun.Thread;

public class ToRunAThreadUsingRunnableInterface {
	public static void main(String[] args) {
		Thread t1 = new Thread(new demo2());
		Thread t2 = new Thread(new demo2());

		t1.start();
		t2.start();

	}
}

class demo2 implements Runnable {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello " + i);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
