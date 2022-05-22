package com.test.creational.factory;

import java.io.Serializable;

/*
 * @created 22-05-2022
 * @project DesignPatterns
 * @author Nihar
 */
public class NotificationData implements Serializable {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
