package com.dbs.QueueImplementation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.QueueImplementation.dao.MessageDao;
import com.dbs.QueueImplementation.dao.QueueDao;
import com.dbs.QueueImplementation.model.Message;
import com.dbs.QueueImplementation.model.Queue;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired MessageDao dao;
	@Autowired QueueDao queueDao;
	
	public Message addMessage(Message message) {
		Integer queueId = message.getQueue().getId();
		Optional<Queue> queueOp = queueDao.findById(queueId);
		if(!queueOp.isPresent()) {
			
		}
		
		
		return dao.save(message);
	}

}
