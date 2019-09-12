package com.sdp.plinfo.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Coach {

	//GraphQL fields
	String name;
	
	String shortName;
	
	String country;
}
