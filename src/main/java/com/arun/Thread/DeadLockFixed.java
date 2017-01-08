package com.arun.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeadLockFixed {
	public static void main(String[] args) {

		ExecutorService executors = Executors.newFixedThreadPool(2);
		int count = 0;
		for (int i = 0; i < 100; i++) {
			executors.submit(new Processor4());
			count++;
		}
		System.out.println("Complete..");
		try {
			executors.awaitTermination(1000, TimeUnit.MILLISECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executors.shutdown();
		System.out.println("Code completed..." + count);
	}
}

class Processor4 implements Runnable {

	@Override
	public void run() {
		System.out.println("Inside run....");
		Method1();
		Method2();
	}

	public void Method1() {
		synchronized (String.class) {
			System.out.println("Calling String class of Method 1...");

			synchronized (Integer.class) {
				System.out.println("Calling Integer class of Method 1..");
			}
		}
	}

	public void Method2() {
		synchronized (String.class) {
			System.out.println("Calling String class of Method 2..");
			synchronized (Integer.class) {
				System.out.println("Calling Integer class of Method 2..");

			}
		}
	}

}
