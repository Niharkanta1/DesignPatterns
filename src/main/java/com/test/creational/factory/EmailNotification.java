package com.test.creational.factory;

/*
 * @created 22-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Sending an Email notification");
		data.setMessage("Email Data");
	}
}
