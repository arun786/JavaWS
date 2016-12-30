package com.arun.concurrenthashmaptut;

import java.util.Map;

public class MapHelper1 implements Runnable {
	Map<String, Integer> map;

	public MapHelper1(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Maphelper1").start();
	}

	@Override
	public void run() {
		map.put("one", 1);
		try {
			Thread.sleep(100);
			System.out.println("Helper1 sleeping");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MapHelper2 implements Runnable {
	Map<String, Integer> map;

	public MapHelper2(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Maphelper2").start();
	}

	@Override
	public void run() {
		map.put("two", 2);
		try {
			Thread.sleep(100);
			System.out.println("Helper2 sleeping");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class MapHelper3 implements Runnable {
	Map<String, Integer> map;

	public MapHelper3(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Maphelper3").start();
	}

	@Override
	public void run() {
		map.put("Three", 3);
		try {
			Thread.sleep(100);
			System.out.println("Helper3 sleeping");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class MapHelper4 implements Runnable {
	Map<String, Integer> map;

	public MapHelper4(Map<String, Integer> map) {
		this.map = map;
		new Thread(this, "Maphelper4").start();
	}

	@Override
	public void run() {
		map.put("Four", 4);
		try {
			Thread.sleep(100);
			System.out.println("Helper4 sleeping");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}