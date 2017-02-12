package com.arun.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierService {

	public static void main(String[] args) {
		CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
			@Override
			public void run() {
				System.out.println("since all the parties have reached, we start the race...");
			}
		});

		Thread t1 = new Thread(new Process(cb));
		Thread t2 = new Thread(new Process(cb));
		Thread t3 = new Thread(new Process(cb));

		t1.start();
		t2.start();
		t3.start();
	}

}

class Process implements Runnable {

	CyclicBarrier cb;

	public Process(CyclicBarrier cb) {
		this.cb = cb;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + " has reached the barrier to start the race");
		try {
			
			Thread.sleep(3000);
			cb.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has crossed the barrier, race has started");
	}

}


/*o/p will be as follows

Thread-0 has reached the barrier to start the race
Thread-1 has reached the barrier to start the race
Thread-2 has reached the barrier to start the race
since all the parties have reached, we start the race...
Thread-0 has crossed the barrier, race has started
Thread-2 has crossed the barrier, race has started
Thread-1 has crossed the barrier, race has started*/
