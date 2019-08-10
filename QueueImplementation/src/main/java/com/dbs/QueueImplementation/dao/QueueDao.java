package com.dbs.QueueImplementation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dbs.QueueImplementation.model.Queue;

public interface QueueDao extends JpaRepository<Queue, Integer> {

	@Query("select count(e) from Queue e")
	public int getCountByQueue();
	
}
