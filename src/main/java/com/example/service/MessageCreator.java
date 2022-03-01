package com.example.service;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @author Vladyslav Paun
 */
@Component
public class MessageCreator {
	private final JmsMessagingTemplate jmsMessagingTemplate;
	private final Queue queue;

	public MessageCreator(JmsMessagingTemplate jmsMessagingTemplate, Queue queue) {
		this.jmsMessagingTemplate = jmsMessagingTemplate;
		this.queue = queue;
	}

	public void sendMessage(){
		jmsMessagingTemplate.convertAndSend(queue, "Hello Java2blog!!");
	}
}
