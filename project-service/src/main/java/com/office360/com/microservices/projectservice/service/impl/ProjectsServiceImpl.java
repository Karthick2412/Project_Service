package com.office360.com.microservices.projectservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.office360.com.microservices.projectservice.common.APIResponse;
import com.office360.com.microservices.projectservice.entity.Project;
import com.office360.com.microservices.projectservice.repository.ProjectsRepository;
import com.office360.com.microservices.projectservice.service.ProjectsService;

@Service
public class ProjectsServiceImpl implements ProjectsService{

	private ProjectsRepository projectRepo;

	public ProjectsServiceImpl(ProjectsRepository projectRepo) {
		super();
		this.projectRepo = projectRepo;
	}

	@Override
	public APIResponse getAllProjects() {
		List<Project> allProjects=projectRepo.findAll();
		APIResponse api=new APIResponse();
		api.setData(allProjects);
		return api;
	}
	
	
}
