package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.org.nesi.nesischeduler.project.model.ResearcherProject;

public interface ResearcherProjectRepository extends JpaRepository<ResearcherProject, Integer> {

}
