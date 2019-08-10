package com.dbs.QueueImplementation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.model.Queue;
import com.dbs.QueueImplementation.service.QueueService;

@RestController
@CrossOrigin
public class QueueController {
	
	private int maxQueues = 10;
	
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
	
	@RequestMapping(value="/queue/getallqueues",method=RequestMethod.GET)
	public List<Queue> getAllQueues(){
		return queueService.getAllQueues();
	}
	
	@RequestMapping(value="/queue/deletequeue/{id}",method=RequestMethod.POST)
	public String deleteQueue(@PathVariable int id){
		return queueService.deleteQueue(id);
	}
	
	@RequestMapping(value="/queue/addqueueandgetall",method=RequestMethod.POST)
	public List<Queue> addQueueAndGetInfo(@RequestBody Queue queue){
		if(queue.getQueueName()!=null && queue.getQueueName().trim().length()>0 && queue.getSize()>0){
			 queueService.addQueue(queue);
		} 
		return queueService.getAllQueues();
	}
	
	@RequestMapping(value="/queue/checkqueuesize",method=RequestMethod.GET)
	public boolean maxQueueSizeReached(){
		if(queueService.getCountByQueue()>maxQueues){
			return true;
		}
		return false;
	}
	
}
