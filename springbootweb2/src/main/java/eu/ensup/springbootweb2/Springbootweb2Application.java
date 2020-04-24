package eu.ensup.springbootweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan("eu.ensup.springbootweb2.domaine")
@SpringBootApplication
public class Springbootweb2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springbootweb2Application.class, args);
	}
}
