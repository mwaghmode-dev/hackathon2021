package com.assesmentportal.controller;

import java.util.List;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.assesmentportal.models.Team;
import com.assesmentportal.models.Topic;
import com.assesmentportal.services.TeamService;
import com.assesmentportal.services.TopicService;

@Slf4j
@RestController

@RequestMapping(value = "/api/assesmentportal", produces = MediaType.APPLICATION_JSON_VALUE)
public class TeamController {

	@Autowired
	TeamService teamService;

	@GetMapping(value = "/team")
	public List<Team> getAllTopics() {
		log.info("inside getAllTopics");
		return teamService.getAllTeams();
	}

	@ResponseStatus(HttpStatus.CREATED)
	@RequestMapping(value = "/team", method = RequestMethod.POST)
	public Team addTopic(@RequestBody Team team) {
		log.info("inside add record:" + team);
		return teamService.addTeam(team);
	}


	@GetMapping(value = "/team/{id}")
	public Team findById(@PathVariable("id") String id) {
		log.info("inside find by id:{}", id);
		return teamService.getTeamById(id);
	}

}
