package com.assesmentportal.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Topic;

@Repository
public interface QuestionRepository extends MongoRepository<Question, Integer> {

	@Override
	public List<Question> findAll();

	public Question getQuestionById(int id);

	@Override
	public Question save(Question question);
}
