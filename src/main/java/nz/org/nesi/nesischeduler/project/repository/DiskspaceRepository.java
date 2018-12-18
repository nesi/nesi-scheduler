package nz.org.nesi.nesischeduler.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import nz.org.nesi.nesischeduler.project.model.Diskspace;

public interface DiskspaceRepository extends JpaRepository<Diskspace, Integer>{
	List<Diskspace> findByCode(@Param("projectCode") String projectCode);
}
