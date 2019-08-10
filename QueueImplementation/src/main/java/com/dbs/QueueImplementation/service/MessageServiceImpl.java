package com.dbs.QueueImplementation.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
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
			List<Queue> queues = queueDao.findAll();
			int size = -1;
			int queueId = 0;
			Queue tempQueue = new Queue() ;
			for(Queue queue:queues) {
				int currentQueSize= dao.getCountByQueueId(queue.getId());
				System.out.println(currentQueSize);
				if(currentQueSize!=queue.getSize()) {
					if(size==-1) {
						size = currentQueSize;
						queueId = queue.getId();
						tempQueue = queue;
					}
					if(size>currentQueSize) {
						size = currentQueSize;
						queueId = queue.getId();
						tempQueue = queue;
					}
					
				}
			}
		if(size == -1) {
			messageDTO.setErrorMessage("All Queues are Full");
			messageDTO.setStatus("F");
			return messageDTO;
		}
		
		
		message.setQueue(tempQueue);
		 message=dao.save(message);
		 messageDTO.setId(message.getId());
		 messageDTO.setMsgBody(message.getMsgBody());
		 messageDTO.setQueue(message.getQueue());
		 messageDTO.setStatus("S");
		
		return messageDTO;
	}

}
