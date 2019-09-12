package com.sdp.plinfo.repository;

import com.sdp.plinfo.model.Team;

public interface PlTeamsRepository {

	public Team getTeamByName(String name);
	
	public Team getTeamByShortName(String shortName);
	
	public Team getTeamByTablePosition(Integer tablePosition);
}
