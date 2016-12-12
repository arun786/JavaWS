package com.arun.Thread;

import java.util.Scanner;

public class ToPreventCachingVolatileKeyWord {

	/* To prevent caching of variable Volatile keyword is used */
	public static void main(String[] args) {
		demo4 d1 = new demo4();
		d1.start();

		System.out.println("Please enter to stop the thread...");
		Scanner scan = new Scanner(System.in);
		scan.nextLine();

		d1.shutdown();
		scan.close();
	}

}

class demo4 extends Thread {

	/*
	 * runner is made volatile so that value of runner is not cached and the loop never
	 * stops
	 */
	private volatile boolean runner = true;

	@Override
	public void run() {

		while (runner) {
			System.out.println("hello...");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void shutdown() {
		runner = false;
	}

}
