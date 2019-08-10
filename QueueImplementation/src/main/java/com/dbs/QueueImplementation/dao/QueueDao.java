package com.dbs.QueueImplementation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.QueueImplementation.model.Queue;

public interface QueueDao extends JpaRepository<Queue, Integer> {

	
}
