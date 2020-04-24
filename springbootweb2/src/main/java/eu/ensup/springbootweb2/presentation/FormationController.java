package eu.ensup.springbootweb2.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import eu.ensup.springbootweb2.service.FormationService;
import eu.ensup.springbootweb2.service.IFormationService;

@Controller
public class FormationController {

	@Autowired
	IFormationService iformationservice;

	@Bean
	public FormationService iformationservice() {
		return new FormationService();
	}

	public FormationController() {
		super();
	}

	// http://localhost:8080/theme
	@RequestMapping(value = "/theme", method = RequestMethod.GET)
	public String listerLesFormation(Model model) {
		System.out.println("okok");
		model.addAttribute("listeformation", iformationservice.lireFormations());
		return "liste";
	}
}
