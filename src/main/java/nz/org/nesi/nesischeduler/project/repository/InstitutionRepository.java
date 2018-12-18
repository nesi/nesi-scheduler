package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.org.nesi.nesischeduler.project.model.Institution;

public interface InstitutionRepository extends JpaRepository<Institution, Integer> {

}
