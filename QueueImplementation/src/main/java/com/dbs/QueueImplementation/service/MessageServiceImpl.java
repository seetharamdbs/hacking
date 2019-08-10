package com.dbs.QueueImplementation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.QueueImplementation.dao.MessageDao;
import com.dbs.QueueImplementation.model.Message;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired MessageDao dao;
	
	public Message addMessage(Message message) {
		return dao.save(message);
	}

}
