package com.office360.com.microservices.projectservice.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="app_project_user")
public class ProjectAssingnedUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
//	@Column(columnDefinition = "BINARY(16)")
	private UUID Id;
	
//	@Column(columnDefinition = "BINARY(16)")
	private UUID projectId;
	
//	@Column(columnDefinition = "BINARY(16)")
	private UUID userId;

	public ProjectAssingnedUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjectAssingnedUser(UUID id, UUID projectId, UUID userId) {
		super();
		Id = id;
		this.projectId = projectId;
		this.userId = userId;
	}

	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}

	public UUID getProjectId() {
		return projectId;
	}

	public void setProjectId(UUID projectId) {
		this.projectId = projectId;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}
	
	
	

}
