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

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Topic;
import com.assesmentportal.services.QuestionService;
import com.assesmentportal.services.TopicService;

@Slf4j
@RestController

@RequestMapping(value = "/api/assesmentportal", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@GetMapping(value = "/question")
	public List<Question> getAllTopics() {
		log.info("inside getAllTopics");
		return questionService.getAllQuestion();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/question", method = RequestMethod.POST)
	public Question addTopic(@RequestBody Question question) {
		log.info("inside add record:" + question);
		return questionService.addQuestion(question);
	}

	@RequestMapping(value = "/question", method = RequestMethod.PUT)
	public Question updateTopic(@RequestBody Question question) {
		log.info("Inside update record:" + question);
		return questionService.updateQuestion(question);
	}

	@GetMapping(value = "/question/{id}")
	public Question findById(@PathVariable("id") String id) {
		log.info("inside find by id:{}", id);
		return questionService.getQuestionById(id);
	}
	@GetMapping(value = "/question/{id}")
	public List<Question> findAllQuestionOfTopic(@PathVariable("id") String topic) {
		log.info("inside find by id:{}", topic);
		return questionService.getQuestionOfTopic(topic);
	}

}
