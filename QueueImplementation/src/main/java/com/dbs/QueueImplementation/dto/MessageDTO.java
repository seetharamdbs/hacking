package com.dbs.QueueImplementation.dto;

import org.springframework.stereotype.Component;

import com.dbs.QueueImplementation.model.Queue;


public class MessageDTO {

	private int id ;
	private String msgBody;
	
	private Queue queue;
	
	private String status;
	private String errorMessage;
	
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
