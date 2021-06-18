package com.assesmentportal.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesmentportal.models.Topic;
import com.assesmentportal.repositories.TopicRepository;
import com.assesmentportal.services.TopicService;

@Service
public class TopicServiceImpl implements TopicService {

	@Autowired
	TopicRepository topicRepository;

	@Override
	public List<Topic> getAllTopics() {
		return topicRepository.findAll();
	}

	@Override
	public Topic getTopicsById(int id) {
		for ( Topic topic:topicRepository.findAll()) {
			if (topic.getId() == id)
				return topic;
		}
		return null;
	}

	@Override
	public Topic addTopic(Topic topic) {
		return topicRepository.save(topic);
	}

	@Override
	public Topic updateTopic(Topic topic) {
		return topicRepository.save(topic);
	}
}
