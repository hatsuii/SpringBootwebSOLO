package eu.ensup.springbootweb2.service;

import java.util.List;

import eu.ensup.springbootweb2.domaine.Formation;

public interface IFormationService {

	Formation creerFormation(Formation pformation);

	List<Formation> lireFormations();

}