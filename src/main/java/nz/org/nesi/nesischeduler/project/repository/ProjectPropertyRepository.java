package nz.org.nesi.nesischeduler.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import nz.org.nesi.nesischeduler.project.model.ProjectProperty;

public interface ProjectPropertyRepository extends JpaRepository<ProjectProperty, Integer>{
	List<ProjectProperty> findAllByProjectId(@Param("facilityId") Integer facilityId, @Param("projectId") Integer projectId, @Param("propname") String propname);
}
