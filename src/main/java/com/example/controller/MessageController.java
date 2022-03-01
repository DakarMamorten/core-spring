package com.example.controller;

import com.example.service.MessageCreator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/message")
public class MessageController {
	private final MessageCreator messageCreator;

	public MessageController(MessageCreator messageCreator) {
		this.messageCreator = messageCreator;
	}

	@GetMapping("/send")
	public String sendMessage(){
		messageCreator.sendMessage();
		return "OK";
	}
}
