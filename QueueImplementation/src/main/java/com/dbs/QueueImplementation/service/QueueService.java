package com.dbs.QueueImplementation.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.dbs.QueueImplementation.model.Queue;

public interface QueueService {

	public Queue addQueue(@RequestBody Queue queue);
	
	public boolean isQueueFull(int id);
	
	public boolean isQueueEmpty(int id);
	
	public List<Queue> getAllQueues();
	
	public String deleteQueue(@PathVariable int id);
	
	public int getCountByQueue();
}
