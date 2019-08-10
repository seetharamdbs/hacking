package com.dbs.QueueImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.service.QueueService;

@RestController
public class QueueController {
	
	@Autowired
	private QueueService queueService;

	@RequestMapping("/")
	public String welcome(){
		return "welcome";
	}
}
