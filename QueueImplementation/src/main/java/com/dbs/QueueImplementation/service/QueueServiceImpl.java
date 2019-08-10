package com.dbs.QueueImplementation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.QueueImplementation.dao.MessageDao;
import com.dbs.QueueImplementation.dao.QueueDao;
import com.dbs.QueueImplementation.model.Queue;

@Service
public class QueueServiceImpl implements QueueService{

	@Autowired
	private QueueDao queueDao;
	
	@Autowired
	private MessageDao messageDao;

	@Override
	public Queue addQueue(Queue queue) {
		return queueDao.save(queue);
	}

	@Override
	public boolean isQueueFull(int id) {
		Optional<Queue> queue = queueDao.findById(id);
		
		int messagesCountForQueue = messageDao.getCountByQueueId(id);
		
		if(!queue.isPresent()){
			return false;
		}
		
		if(messagesCountForQueue>=queue.get().getSize()){
			return true;
		}
		return false;
	}
	@Override
	public boolean isQueueEmpty(int id) {
		Optional<Queue> queue = queueDao.findById(id);
		
		int messagesCountForQueue = messageDao.getCountByQueueId(id);
		
		if(!queue.isPresent()){
			return false;
		}
		if(messagesCountForQueue==0){
			return true;
		}
		
		return false;
	}
	
}
