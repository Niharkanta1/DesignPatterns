package com.test.creational.singleton;

/*
 * @created 08-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class MySingletonDemo {
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadOne());
		Thread t2 = new Thread(new ThreadTwo());
		t1.start();
		t2.start();
	}

	static class ThreadOne implements Runnable {
		@Override
		public void run() {
			MySingleton singleton = MySingleton.getInstance("Test My Singleton1");
			ThreadSafeSingleton singleton_ts = ThreadSafeSingleton.getInstance("Test Threadsafe Singleton1");
			System.out.println(singleton.value);
			System.out.println(singleton_ts.value);
		}
	}

	static class ThreadTwo implements Runnable {
		@Override
		public void run() {
			MySingleton singleton = MySingleton.getInstance("Test My Singleton2");
			ThreadSafeSingleton singleton_ts = ThreadSafeSingleton.getInstance("Test Threadsafe Singleton2");
			System.out.println(singleton.value);
			System.out.println(singleton_ts.value);
		}
	}
}


