package com.dbs.QueueImplementation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.dto.MessageDTO;
import com.dbs.QueueImplementation.model.Message;
import com.dbs.QueueImplementation.model.Queue;
import com.dbs.QueueImplementation.service.MessageService;
import com.dbs.QueueImplementation.service.QueueService;

@RestController
@CrossOrigin
public class MessageController {

	@Autowired
	private MessageService messageService;
	@Autowired
	private QueueService queueService;
	
	@RequestMapping(value="/message/add",method=RequestMethod.POST)
	public MessageDTO getMessage(@RequestBody Message message) {
		
		return messageService.addMessage(message);
	}
	
	@RequestMapping(value="/message/add/getAll",method=RequestMethod.POST)
	public List<Queue> addMsgAndGetAll(@RequestBody Message message) {
		
		 messageService.addMessage(message);
		 return queueService.getAllQueues();
	}
	
}
