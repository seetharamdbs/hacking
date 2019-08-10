package com.dbs.QueueImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.model.Queue;
import com.dbs.QueueImplementation.service.QueueService;

@RestController
public class QueueController {
	
	@Autowired
	private QueueService queueService;

	@RequestMapping("/")
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping(value="/queue/addqueue",method=RequestMethod.POST)
	public Queue addQueue(@RequestBody Queue queue){
		return queueService.addQueue(queue);
	}
	
	@RequestMapping(value="/queue/isqueuefull/{id}",method=RequestMethod.POST)
	public boolean isQueueFull(@PathVariable int id){
		return queueService.isQueueFull(id);
	}
	
	@RequestMapping(value="/queue/isqueueempty/{id}",method=RequestMethod.POST)
	public boolean isQueueEmpty(@PathVariable int id){
		return queueService.isQueueEmpty(id);
	}
}
