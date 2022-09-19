package com.example.demo.controller;

import java.io.File;
import java.io.IOException;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.DTO.Workflow;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class JsonController {

	@GetMapping("/json-data")
	public Workflow getWorkflow() throws StreamReadException, DatabindException, IOException {
	
		
		ObjectMapper mapper = new ObjectMapper();
		Workflow workflow = mapper.readValue(new File("src/main/resources/Workflow.json"), Workflow.class);
		return workflow;
	}
}