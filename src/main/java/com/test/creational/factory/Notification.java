package com.test.creational.factory;

/*
 * @created 22-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public interface Notification {
	NotificationData data = new NotificationData();
	void notifyUser();
}
