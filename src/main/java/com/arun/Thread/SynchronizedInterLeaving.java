package com.arun.Thread;

public class SynchronizedInterLeaving {

	private int count;

	public synchronized void getCount() {
		count++;
	}

	public static void main(String[] args) {
		SynchronizedInterLeaving s = new SynchronizedInterLeaving();
		s.doWork();
	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000; i++) {
					getCount();
					;
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				for (int i = 0; i < 10000; i++) {
					getCount();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Count is " + count);
	}

}
