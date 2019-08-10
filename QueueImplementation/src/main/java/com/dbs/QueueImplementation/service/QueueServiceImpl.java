package com.dbs.QueueImplementation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.QueueImplementation.dao.QueueDao;
import com.dbs.QueueImplementation.model.Queue;

@Service
public class QueueServiceImpl implements QueueService{

	@Autowired
	private QueueDao queueDao;

	@Override
	public Queue addQueue(Queue queue) {
		return queueDao.save(queue);
	}
	
	
}
