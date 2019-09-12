package com.sdp.plinfo.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.sdp.plinfo.model.Team;
import com.sdp.plinfo.repository.PlTeamsRepository;

@Component
public class Query implements GraphQLQueryResolver {

	private PlTeamsRepository repository;
	
	@Autowired
	public Query (PlTeamsRepository repository) {
		this.repository = repository;
	}
	
	public Team plteam (String name, String shortName, Integer tablePosition) {
		
		if (name != null) return repository.getTeamByName(name);
		
		if (shortName != null) return repository.getTeamByShortName(shortName);
		
		if (tablePosition != null) return repository.getTeamByTablePosition(tablePosition);
		
		return null;
	}
}
