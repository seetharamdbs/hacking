package com.dbs.QueueImplementation.dto;

import com.dbs.QueueImplementation.model.Queue;


public class MessageDTO {

	private int id ;
	private String msgBody;
	
	private Queue queue;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	public Queue getQueue() {
		return queue;
	}
	public void setQueue(Queue queue) {
		this.queue = queue;
	}
}
