package eu.ensup.springbootweb2.presentation;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import eu.ensup.springbootweb2.Springbootweb2Application;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Springbootweb2Application.class);
	}

}
