package nz.org.nesi.nesischeduler.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import nz.org.nesi.nesischeduler.project.model.Inode;

public interface InodeRepository extends JpaRepository<Inode, Integer>{
	List<Inode> findByCode(@Param("projectCode") String projectCode);
}
