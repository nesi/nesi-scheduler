package nz.org.nesi.nesischeduler.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import nz.org.nesi.nesischeduler.project.model.ResearcherProperty;

@Repository
public interface ResearcherPropertiesRepository extends JpaRepository<ResearcherProperty, Integer>{
	List<ResearcherProperty> findByPropvalue(@Param("propvalue") String propvalue);
}
