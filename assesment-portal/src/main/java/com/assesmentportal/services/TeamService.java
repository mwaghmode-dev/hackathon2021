package com.assesmentportal.services;

import java.util.List;

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Team;

public interface TeamService {

	public List<Team> getAllTeams();

	public Team getTeamById(String id);

	public Team addTeam(Team team);

	public Team updateTeam(Team team);
}
