package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nz.org.nesi.nesischeduler.project.model.UserInstitution;

public interface UserInstitutionRepository extends JpaRepository<UserInstitution, Integer> {

}
