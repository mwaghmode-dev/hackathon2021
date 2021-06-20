package com.assesmentportal.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.assesmentportal.models.Question;
import com.assesmentportal.models.Team;

@Repository
public interface TeamRepository extends MongoRepository<Team, Integer> {

	@Override
	public List<Team> findAll();

	public Question getTeamById(int id);

	@Override
	public Team save(Team team);
}
