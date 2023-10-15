package com.office360.com.microservices.projectservice.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office360.com.microservices.projectservice.entity.ProjectAssingnedUser;

public interface ProjectAssingnedUserRepository extends JpaRepository<ProjectAssingnedUser, UUID>{

	List<ProjectAssingnedUser> findByUserId(UUID userId);
}
