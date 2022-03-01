package com.example.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @author Vladyslav Paun
 */
@Component
public class MessageReceiver {
	@JmsListener(destination = "java2blog.queue")
	public void receiveQueue(String text) {
		try {
			Thread.sleep(5000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Message Received: " + text);
	}
}
