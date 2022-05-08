package com.test.creational.singleton;

/*
 * @created 08-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class ThreadSafeSingleton {
	private static volatile ThreadSafeSingleton Instance;

	public String value;

	private ThreadSafeSingleton(String value) {
		// The following code emulates slow initialization.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}

	public static ThreadSafeSingleton getInstance(String value) {
		ThreadSafeSingleton result = Instance;
		if(result != null)
			return result;

		synchronized (ThreadSafeSingleton.class) {
			if(Instance == null)
				Instance = new ThreadSafeSingleton(value);
			return Instance;
		}
	}
}
