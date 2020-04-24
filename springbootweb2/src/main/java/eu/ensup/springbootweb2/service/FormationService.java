package eu.ensup.springbootweb2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eu.ensup.springbootweb2.dao.FormationRepository;
import eu.ensup.springbootweb2.domaine.Formation;

public class FormationService implements IFormationService {

	@Autowired
	FormationRepository dao;

	public FormationService(FormationRepository formationrepository) {
		super();
		this.dao = formationrepository;
	}

	public FormationService() {
		super();
	}

	@Override
	public Formation creerFormation(Formation pformation) {
		return dao.save(pformation);
	}

	@Override
	public List<Formation> lireFormations() {
		return dao.findAll();
	}

}
