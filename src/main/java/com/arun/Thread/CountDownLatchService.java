package com.arun.Thread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchService {
	
	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(3);
		
		Thread cacheService = new Thread(new Runner("CacheService", 1000, latch));
		Thread alertService = new Thread(new Runner("AlertService",1000, latch));
		Thread validationService = new Thread(new Runner("ValidationService", 1000, latch));
		
		cacheService.start();
		alertService.start();
		validationService.start();
		
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Since all the services are up..we can start the main application....");
	}
}

class Runner implements Runnable {
	private String name;
	private int timeToStart;
	private CountDownLatch latch;

	public Runner(String name, int timeToStart, CountDownLatch latch) {
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Service " + name + " is up");
		latch.countDown();
	}

}

/*o/p will be 

Service CacheService is up
Service ValidationService is up
Service AlertService is up
Since all the services are up..we can start the main application....*/

