package com.arun.Thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultipleLocks {
	public static void main(String[] args) {
		new Worker().main();
	}

}

class Worker {
	private List<Integer> lst1 = new ArrayList<Integer>();
	private List<Integer> lst2 = new ArrayList<Integer>();
	Object lock1 = new Object();
	Object lock2 = new Object();

	private Random random = new Random();

	public void stageOne() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lst1.add(random.nextInt(100));
	}

	public void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		lst2.add(random.nextInt(100));
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			synchronized (lock1) {
				stageOne();
			}
			synchronized (lock2) {
				stageTwo();
			}
		}
	}

	public void main() {
		System.out.println("Starting....");
		long startTime = System.currentTimeMillis();

		Thread t1 = new Thread(new Runnable() {

			public void run() {
				process();
			}

		});

		Thread t2 = new Thread(new Runnable() {

			public void run() {
				process();
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

		long endTime = System.currentTimeMillis();

		System.out.println("Time Taken : " + (endTime - startTime));
		System.out.println("Size of list1 " + lst1.size() + " list2 " + lst2.size());
	}
}
