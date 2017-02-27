package com.arun.Thread;

import java.util.LinkedList;

public class ProducerConsumerProblem {

	/* Also known as Bounded - buffer Problem */
	public static void main(String[] args) throws InterruptedException {
		final PC pc = new PC();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.Producer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.Consumer();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();

	}

}

class PC {
	private LinkedList<Integer> lst = new LinkedList<Integer>();
	private int capacity = 2;

	public void Consumer() throws InterruptedException {
		while (true) {

			synchronized (this) {

				if (lst.size() == 0) {
					wait();
				}
				int value = lst.removeFirst();
				System.out.println("Removed from the list.." + value);
				notify();
				Thread.sleep(1000);
			}
		}
	}

	public void Producer() throws InterruptedException {
		int count = 0;
		while (true) {
			synchronized (this) {
				while (lst.size() == capacity) {
					wait();
				}

				lst.add(++count);
				System.out.println("added value to the list " + count);
				notify();
				Thread.sleep(1000);
			}
		}
	}
}