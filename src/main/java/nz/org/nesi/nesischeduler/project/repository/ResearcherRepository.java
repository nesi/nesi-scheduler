package nz.org.nesi.nesischeduler.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.org.nesi.nesischeduler.project.model.Researcher;

@Repository
public interface ResearcherRepository extends JpaRepository<Researcher, Integer>{

	List<Researcher> getAllActiveResearchers();

}
