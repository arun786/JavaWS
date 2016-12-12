package com.arun.Thread;

public class ToRunAThreadUsingThreadClass {
	public static void main(String[] args) {
		demo1 d1 = new demo1();
		d1.start();
		
		demo1 d2 = new demo1();
		d2.start();
	}
}

class demo1 extends Thread {

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
