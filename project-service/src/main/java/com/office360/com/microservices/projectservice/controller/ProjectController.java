package com.office360.com.microservices.projectservice.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.office360.com.microservices.projectservice.common.APIResponse;
import com.office360.com.microservices.projectservice.dto.CreateReqProjectAssingned;
import com.office360.com.microservices.projectservice.entity.Project;
import com.office360.com.microservices.projectservice.repository.ProjectsRepository;
import com.office360.com.microservices.projectservice.service.impl.ProjectAssingnedUserServiceImpl;
import com.office360.com.microservices.projectservice.service.impl.ProjectsServiceImpl;


@RestController
@RequestMapping("projects")
public class ProjectController {

	
	@Autowired
	private ProjectsRepository projectRepo;
	
	@Autowired
	private ProjectsServiceImpl projectService;
	
	@Autowired
	private ProjectAssingnedUserServiceImpl projectAssingedService;
	
	@PostMapping("new")
	public Project addProject(@RequestBody Project project) {
		return projectRepo.save(project);
	}
	
	@GetMapping("all")
	public APIResponse allProjects() {
		return projectService.getAllProjects();
	}
	
	@PostMapping("assingned")
	public APIResponse projectAssingned(@RequestBody CreateReqProjectAssingned request) {
		return projectAssingedService.createProjectAssingnedUser(request);
	}
	
	@GetMapping("byuserid/{userId}")
	public APIResponse projectsByUser(@PathVariable UUID userId) {
		return projectAssingedService.getProjectsByUsedId(userId);
	}
}
