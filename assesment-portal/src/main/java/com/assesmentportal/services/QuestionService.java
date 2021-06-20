package com.assesmentportal.services;

import java.util.List;

import com.assesmentportal.models.Question;

public interface QuestionService {

	public List<Question> getAllQuestion();

	public Question getQuestionById(String id);

	public List<Question> getQuestionOfTopic(String topic);

	public Question addQuestion(Question question);

	public Question updateQuestion(Question question);
}
