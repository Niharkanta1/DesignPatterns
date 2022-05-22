package com.test.creational.factory;

/*
 * @created 22-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class NotificationFactory {
	public Notification createNotification(String type) {
		if (type == null || type.isEmpty())
			return null;
		switch (type) {
			case "EMAIL":
				return new EmailNotification();
			case "PUSH":
				return new PushNotification();
			case "SMS":
				return new SmsNotification();
			default:
				throw new RuntimeException("No Notification type found::"+type);
		}
	}
}
