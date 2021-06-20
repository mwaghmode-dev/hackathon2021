package com.assesmentportal.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Quiz;
import com.assesmentportal.models.Team;

@Repository
public interface QuizRepository extends MongoRepository<Quiz, Integer> {

	@Override
	public List<Quiz> findAll();

	@Override
	public Quiz save(Quiz team);
}
