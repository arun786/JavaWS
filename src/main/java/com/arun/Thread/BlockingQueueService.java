package com.arun.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueService {
	public static void main(String[] args) {
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

		Thread consumer = new Thread(new Consumer(queue));
		Thread producer = new Thread(new Producer(queue));

		producer.start();
		consumer.start();
		

		System.out.println("Completed...");
	}
}

class Producer implements Runnable {

	BlockingQueue<String> queue;

	public Producer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {

			try {
				queue.put("Queue " + i);
				System.out.println("Added Queue " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {
	BlockingQueue<String> queue;

	public Consumer(BlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("Removed " + queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
