package com.assesmentportal.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Team;
import com.assesmentportal.repositories.QuestionRepository;
import com.assesmentportal.repositories.TeamRepository;
import com.assesmentportal.services.QuestionService;
import com.assesmentportal.services.TeamService;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	TeamRepository teamRepository;

	@Override
	public List<Team> getAllTeams() {
		return teamRepository.findAll();
	}

	@Override
	public Team getTeamById(String id) {
		for (Team team : teamRepository.findAll()) {
			if (team.getId() == id) {
				return team;
			}
		}
		return null;
	}

	@Override
	public Team addTeam(Team question) {
		return teamRepository.save(question);
	}

	@Override
	public Team updateTeam(Team question) {
		return teamRepository.save(question);
	}
}
