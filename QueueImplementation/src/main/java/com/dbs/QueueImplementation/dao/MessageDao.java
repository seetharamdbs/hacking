package com.dbs.QueueImplementation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.QueueImplementation.model.Message;

public interface MessageDao extends JpaRepository<Message, Integer> {

	@Query("select count(e) from Message e where e.queue.id = ?1")
	public int getCountByQueueId(int id);
	
}
