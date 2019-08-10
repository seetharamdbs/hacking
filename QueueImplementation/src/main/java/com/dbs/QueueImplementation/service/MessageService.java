package com.dbs.QueueImplementation.service;

import com.dbs.QueueImplementation.dto.MessageDTO;
import com.dbs.QueueImplementation.model.Message;

public interface MessageService {
	public MessageDTO addMessage(Message message) ;
}
