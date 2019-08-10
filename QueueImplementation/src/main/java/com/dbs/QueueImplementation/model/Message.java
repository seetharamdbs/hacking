package com.dbs.QueueImplementation.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Message {
	@Id
	private int id ;
	private String msgBody;
	
	@ManyToOne
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
