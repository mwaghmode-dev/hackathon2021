package com.assesmentportal.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assesmentportal.models.Quiz;
import com.assesmentportal.models.Topic;
import com.assesmentportal.services.QuizService;
import com.assesmentportal.services.TopicService;

@Slf4j
@RestController

@RequestMapping(value = "/api/assesmentportal", produces = MediaType.APPLICATION_JSON_VALUE)
public class QuizController {

	@Autowired
	QuizService quizService;

	@GetMapping(value = "/quiz")
	public List<Quiz> getAllQuiz() {
		log.info("inside getAllTopics");
		return quizService.getAllQuiz();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/quiz", method = RequestMethod.POST)
	public Quiz addQuiz(@RequestBody Quiz quiz) {
		log.info("inside add record:" + quiz);
		return quizService.addQuiz(quiz);
	}

	@PostMapping(value = "/quiz/assign/{team}/{topic}")
	public Topic findById(@PathVariable("topic") String topic,@PathVariable("topic") String team) {
		log.info("inside find by id:{}", team);
		return quizService.addQuiz();
	}
}
