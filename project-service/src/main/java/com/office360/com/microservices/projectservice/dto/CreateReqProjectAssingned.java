package com.office360.com.microservices.projectservice.dto;

import java.util.UUID;

public class CreateReqProjectAssingned {
	
	private UUID projectId;
	
	private UUID userID;
	
	

	public CreateReqProjectAssingned() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UUID getProjectId() {
		return projectId;
	}

	public void setProjectId(UUID projectId) {
		this.projectId = projectId;
	}

	public UUID getUserID() {
		return userID;
	}

	public void setUserID(UUID userID) {
		this.userID = userID;
	}
	
	

}
