package com.dbs.QueueImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
}
