package com.assesmentportal.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assesmentportal.models.Topic;

@Repository
public interface TopicRepository extends MongoRepository<Topic, Integer> {

	@Override
	public List<Topic> findAll();

	public Topic getTopicById(int id);

	@Override
	public Topic save(Topic topic);
}
