package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.org.nesi.nesischeduler.project.model.UserAudit;

@Repository
public interface UserAuditRepository extends JpaRepository<UserAudit, Integer>{
}
