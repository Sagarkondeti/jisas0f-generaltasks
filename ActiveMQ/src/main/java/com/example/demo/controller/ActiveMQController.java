package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActiveMQController {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@GetMapping("/activemq-data")
	public String producerActiveMQ(@RequestBody String message) {
		
		try {
	      jmsTemplate.convertAndSend("queue2", message);
	      return "Sent Message";
		}catch(Exception e) {
			return e.getMessage();
		}
	}
}
