package com.assesmentportal.services;

import java.util.List;

import com.assesmentportal.models.Quiz;
import com.assesmentportal.models.Team;

public interface QuizService {

	public List<Quiz> getAllQuiz();

	public Quiz getQuizById(String id);

	public Quiz addQuiz(Quiz team);
}
