package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.org.nesi.nesischeduler.project.model.ProjectFacility;

public interface ProjectFacilityRepository extends JpaRepository<ProjectFacility, Integer> {

}