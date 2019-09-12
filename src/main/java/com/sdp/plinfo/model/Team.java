package com.sdp.plinfo.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Team {

	//GraphQL fields
	String name;
	
	String shortName;
	
	Integer tablePosition;
	
	Coach coach;
}
