package eu.ensup.springbootweb2.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String theme;
	private String description;

	
	public Formation() {
		super();
	}

	public Formation(Long id, String theme, String description) {
		super();
		this.id = id;
		this.theme = theme;
		this.description = description;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Formation(String theme, String description) {
		super();
		this.theme = theme;
		this.description = description;
	}


	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}