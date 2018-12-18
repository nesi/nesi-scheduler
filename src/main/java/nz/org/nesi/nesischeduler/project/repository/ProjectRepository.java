package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.org.nesi.nesischeduler.project.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer>{
	
}
