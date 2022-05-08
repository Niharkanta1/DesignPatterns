package com.test.creational.singleton;

/*
 * @created 08-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class MySingleton {
	private static MySingleton Instance;

	String value;

	private MySingleton(String value) {
		// The following code emulates slow initialization.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.value = value;
	}

	public static MySingleton getInstance(String value) {
		if(Instance != null)
			return Instance;
		Instance = new MySingleton(value);
		return Instance;
	}
}
