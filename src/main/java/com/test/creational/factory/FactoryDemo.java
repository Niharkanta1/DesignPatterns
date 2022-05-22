package com.test.creational.factory;

/*
 * @created 22-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class FactoryDemo {
	public static void main(String[] args) {
		NotificationFactory notificationFactory = new NotificationFactory();
		Notification myNotification = notificationFactory.createNotification("EMAIL");
		myNotification.notifyUser();
		System.out.println(myNotification.data.getMessage());
	}
}
