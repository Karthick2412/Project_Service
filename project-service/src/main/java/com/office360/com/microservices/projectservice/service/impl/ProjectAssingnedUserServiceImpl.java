package com.office360.com.microservices.projectservice.service.impl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.office360.com.microservices.projectservice.common.APIResponse;
import com.office360.com.microservices.projectservice.dto.CreateReqProjectAssingned;
import com.office360.com.microservices.projectservice.entity.Project;
import com.office360.com.microservices.projectservice.entity.ProjectAssingnedUser;
import com.office360.com.microservices.projectservice.repository.ProjectAssingnedUserRepository;
import com.office360.com.microservices.projectservice.repository.ProjectsRepository;
import com.office360.com.microservices.projectservice.service.ProjectAssingnedUserService;

@Service
public class ProjectAssingnedUserServiceImpl implements ProjectAssingnedUserService{
	
	private ProjectAssingnedUserRepository projectAssingnedRepo;
	
	private ProjectsRepository projectRepo;

	public ProjectAssingnedUserServiceImpl(ProjectAssingnedUserRepository projectAssingnedRepo,ProjectsRepository projectRepo) {
		this.projectAssingnedRepo = projectAssingnedRepo;
		this.projectRepo=projectRepo;
	}



	@Override
	public APIResponse createProjectAssingnedUser(CreateReqProjectAssingned request) {
		ProjectAssingnedUser newRecord=new ProjectAssingnedUser();
		newRecord.setProjectId(request.getProjectId());
		newRecord.setUserId(request.getUserID());
		projectAssingnedRepo.save(newRecord);
		APIResponse api=new APIResponse();
		api.setData(newRecord);
		return api;
	}



	@Override
	public APIResponse getProjectsByUsedId(UUID userId) {
		// TODO Auto-generated method stub
		APIResponse api = new APIResponse();
		List<ProjectAssingnedUser> projectsByUserId=projectAssingnedRepo.findByUserId(userId);
		List<Project> projects=projectsByUserId.stream().map(projectWithId->mapToProject(projectWithId.getProjectId())).collect(Collectors.toList());
		
		api.setData(projects);
		return api;
	}



	private Project mapToProject(UUID projectId) {
		// TODO Auto-generated method stub
		Project project=projectRepo.findById(projectId).orElse(null);
		return project;
	}

}
