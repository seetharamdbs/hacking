package com.dbs.QueueImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.QueueImplementation.service.StatisticsService;

@RestController
@CrossOrigin
public class StatisticsController {

	@Autowired
	private StatisticsService statisticsService;
}
