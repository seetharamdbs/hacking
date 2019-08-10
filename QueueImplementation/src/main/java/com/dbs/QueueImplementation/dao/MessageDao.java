package com.dbs.QueueImplementation.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.QueueImplementation.model.Message;

public interface MessageDao extends JpaRepository<Message, Integer> {

}
