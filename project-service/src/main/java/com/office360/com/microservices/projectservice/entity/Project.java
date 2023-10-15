package com.office360.com.microservices.projectservice.entity;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "app_projects")
public class Project {
	
	@Id
//	@Column(columnDefinition = "BINARY(16)")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID projectId;
	
	private String title;
	
	@Column(columnDefinition = "VARCHAR(300)")
	private String description;
	
	private int projectStatus;

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Project(UUID projectId, String title, String description, int projectStatus) {
		super();
		this.projectId = projectId;
		this.title = title;
		this.description = description;
		this.projectStatus = projectStatus;
	}



	public UUID getProjectId() {
		return projectId;
	}

	public void setProjectId(UUID projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public int getProjectStatus() {
		return projectStatus;
	}



	public void setProjectStatus(int projectStatus) {
		this.projectStatus = projectStatus;
	}
	
	

}

