package com.dbs.QueueImplementation.test.service;

import static org.junit.Assert.*;

import org.junit.Test;

import com.dbs.QueueImplementation.model.Message;
import com.dbs.QueueImplementation.model.Queue;

public class MessageServiceTest {

	@Test
	public void addMessagetest() {
		
		Message msg = new Message();
		msg.setMsgBody("hello");
		msg.setQueue(new Queue());
		
		Message expectedmsg = new Message();
		msg.setMsgBody("hello");
		msg.setQueue(new Queue());
		
		assertEquals(expectedmsg, msg);
	}

}
