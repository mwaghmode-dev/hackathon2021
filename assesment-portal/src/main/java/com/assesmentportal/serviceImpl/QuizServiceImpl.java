package com.assesmentportal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesmentportal.models.Quiz;
import com.assesmentportal.models.Team;
import com.assesmentportal.models.Topic;
import com.assesmentportal.repositories.QuizRepository;
import com.assesmentportal.repositories.TeamRepository;
import com.assesmentportal.repositories.UserRepository;
import com.assesmentportal.services.QuizService;
import com.assesmentportal.services.TeamService;

@Service
public class QuizServiceImpl implements QuizService {

	@Autowired
	QuizRepository quizRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<Quiz> getAllQuiz() {
		return quizRepository.findAll();
	}

	@Override
	public Quiz getQuizById(String id) {
		for (Quiz quiz : quizRepository.findAll()) {
			if (quiz.getId() == id) {
				return quiz;
			}
		}
		return null;
	}

	@Override
	public Quiz addQuiz(Quiz quiz) {
		return quizRepository.save(quiz);
	}

	@Override
	public Quiz assignQuizByTeamAndTopic(Team team, Topic topic) {


		return quizRepository.save(quiz);
	}
}
