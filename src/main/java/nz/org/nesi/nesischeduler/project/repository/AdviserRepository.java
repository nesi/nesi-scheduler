package nz.org.nesi.nesischeduler.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nz.org.nesi.nesischeduler.project.model.Adviser;


@Repository
public interface AdviserRepository extends JpaRepository<Adviser, Integer>{

}
