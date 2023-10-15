package com.office360.com.microservices.projectservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.office360.com.microservices.projectservice.entity.Project;

public interface ProjectsRepository extends JpaRepository<Project, UUID>{

}
