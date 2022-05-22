package com.test.creational.factory;

/*
 * @created 22-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending a push notification");
		data.setMessage("Push Data");
	}
}
