package com.dbs.QueueImplementation.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.dbs.QueueImplementation.model.Queue;

public interface QueueService {

	public Queue addQueue(@RequestBody Queue queue);
}
