package com.example.demo.DTO;

import java.util.ArrayList;

import lombok.Data;

@Data
public class Flows {

	private String workflowId;
	private String workflowTitle;
	private String workflowSummary;
	private String workflowDescription;
	private ArrayList<Stacktrace> stacktrace;
	
}
