package com.example.demo.controller;

 import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	
	@JmsListener(destination = "queue2")
	public void ReceiveMsg(String message) {
		 
		System.out.println(message);
	}
}
