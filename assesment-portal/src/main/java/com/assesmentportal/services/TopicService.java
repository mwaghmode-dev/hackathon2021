package com.assesmentportal.services;

import java.util.List;

import com.assesmentportal.models.Topic;


public interface TopicService {

	public List<Topic> getAllTopics();

	public Topic getTopicsById(int id);

	public Topic addTopic(Topic topic);

	public Topic updateTopic(Topic topic);

}
