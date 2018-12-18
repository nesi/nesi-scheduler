package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.org.nesi.nesischeduler.project.model.Eventlog;

public interface EventLogRepository extends JpaRepository<Eventlog, Integer> {

}
