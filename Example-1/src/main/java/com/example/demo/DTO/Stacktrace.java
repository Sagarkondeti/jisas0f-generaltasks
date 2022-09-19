package com.example.demo.DTO;

import lombok.Data;

@Data
public class Stacktrace {

	private String project;
	private String cluster;
	private String namespace;
	//private String app;
	private String logsSequence;
	private String logsCount;
}
