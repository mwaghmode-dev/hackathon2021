package com.assesmentportal.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assesmentportal.models.Topic;
import com.assesmentportal.services.TopicService;

@Slf4j
@RestController

@RequestMapping(value = "/api/assesmentportal", produces = MediaType.APPLICATION_JSON_VALUE)
public class TopicController {

	@Autowired
	TopicService topicService;

	@GetMapping(value = "/topic")
	public List<Topic> getAllTopics() {
		log.info("inside getAllTopics");
		return topicService.getAllTopics();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/topic", method = RequestMethod.POST)
	public Topic addTopic(@RequestBody Topic topic) {
		log.info("inside add record:" + topic);
		return topicService.addTopic(topic);
	}

	@RequestMapping(value = "/topic", method = RequestMethod.PUT)
	public Topic updateTopic(@RequestBody Topic topic) {
		log.info("Inside update record:" + topic);
		return topicService.updateTopic(topic);
	}

	@GetMapping(value = "/topic/{id}")
	public Topic findById(@PathVariable("id") int id) {
		log.info("inside find by id:{}", id);
		return topicService.getTopicsById(id);
	}

}
