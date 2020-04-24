package eu.ensup.springbootweb2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.springbootweb2.domaine.Formation;

public interface FormationRepository extends JpaRepository<Formation,Long> {

}
