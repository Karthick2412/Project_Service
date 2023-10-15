package com.office360.com.microservices.projectservice.service;

import java.util.UUID;

import com.office360.com.microservices.projectservice.common.APIResponse;
import com.office360.com.microservices.projectservice.dto.CreateReqProjectAssingned;

public interface ProjectAssingnedUserService {
	
	APIResponse createProjectAssingnedUser(CreateReqProjectAssingned request);
	
	APIResponse getProjectsByUsedId(UUID userId);

}
