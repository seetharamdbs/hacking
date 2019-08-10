package com.dbs.QueueImplementation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.QueueImplementation.dao.MessageDao;
import com.dbs.QueueImplementation.dao.QueueDao;
import com.dbs.QueueImplementation.dto.MessageDTO;
import com.dbs.QueueImplementation.dto.QueueDTO;
import com.dbs.QueueImplementation.model.Message;
import com.dbs.QueueImplementation.model.Queue;

@Service
public class MessageServiceImpl implements MessageService {
	@Autowired MessageDao dao;
	@Autowired QueueDao queueDao;
	@Autowired QueueService queueService;

	public MessageDTO addMessage(Message message) {
			MessageDTO messageDTO = new MessageDTO();
		
		if(message.getQueue() ==null) {
			messageDTO.setErrorMessage("Provide Queue ID");
			messageDTO.setStatus("F");
			return messageDTO;
		}
		System.out.println(message);
		
		Integer queueId = message.getQueue().getId();
		
		Optional<Queue> queueOp = queueDao.findById(queueId);
		System.out.println(queueOp.isPresent());
		if(!queueOp.isPresent()) {
			messageDTO.setErrorMessage("Queue does not exist");
			messageDTO.setStatus("F");
			return messageDTO;
		}
		if(queueService.isQueueFull(message.getQueue().getId())) {
			messageDTO.setErrorMessage("Queue is already Full");
			messageDTO.setStatus("F");
			return messageDTO;
		}
		
		 message=dao.save(message);
		 messageDTO.setId(message.getId());
		 messageDTO.setMsgBody(message.getMsgBody());
		 messageDTO.setQueue(message.getQueue());
		 messageDTO.setStatus("S");
		
		return messageDTO;
	}

}
