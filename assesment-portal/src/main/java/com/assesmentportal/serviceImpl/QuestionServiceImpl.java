package com.assesmentportal.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Topic;
import com.assesmentportal.repositories.QuestionRepository;
import com.assesmentportal.repositories.TopicRepository;
import com.assesmentportal.services.QuestionService;
import com.assesmentportal.services.TopicService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> getAllQuestion() {
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionById(String id) {
		for (Question question : questionRepository.findAll()) {
			if (question.getId() == id) {
				return question;
			}
		}
		return null;
	}

	@Override
	public List<Question> getQuestionOfTopic(final String topic) {
		return questionRepository.findAll().stream().filter(question -> question.getTopic().equals(topic)).collect(Collectors.toList());
	}

	@Override
	public Question addQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Question updateQuestion(Question question) {
		return questionRepository.save(question);
	}
}
