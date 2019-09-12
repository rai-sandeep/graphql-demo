package com.sdp.plinfo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sdp.plinfo.model.Coach;
import com.sdp.plinfo.model.Team;

/**
 * Hard coded List based implementation
 *
 */
@Repository
public class PlTeamsRepositoryListImpl implements PlTeamsRepository {
	
	private List<Team> teams;
	
	public PlTeamsRepositoryListImpl() {
		teams = new ArrayList<>();
		teams.add(Team.builder().name("Manchester City").shortName("MNC")
				.tablePosition(1).coach(Coach.builder().name("Pep Guardiola")
						.shortName("Pep").country("Spain").build()).build());
		teams.add(Team.builder().name("Liverpool").shortName("LFC")
				.tablePosition(2).coach(Coach.builder().name("Jurgen Klopp")
						.shortName("Klopp").country("Germany").build()).build());
		teams.add(Team.builder().name("Leicester City").shortName("LEI")
				.tablePosition(3).coach(Coach.builder().name("Brendan Rodgers")
						.shortName("Rodgers").country("Ireland").build()).build());
		teams.add(Team.builder().name("Arsenal").shortName("ARS")
				.tablePosition(4).coach(Coach.builder().name("Unai Emery")
						.shortName("Emery").country("Spain").build()).build());
	}

	@Override
	public Team getTeamByName(String name) {
		for (Team team : teams) {
			if (name.equalsIgnoreCase(team.getName())) return team;
		}
		return null;
	}

	@Override
	public Team getTeamByShortName(String shortName) {
		for (Team team : teams) {
			if (shortName.equalsIgnoreCase(team.getShortName())) return team;
		}
		return null;
	}

	@Override
	public Team getTeamByTablePosition(Integer tablePosition) {
		for (Team team : teams) {
			if (tablePosition.equals(team.getTablePosition())) return team;
		}
		return null;
	}

}
