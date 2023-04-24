package fr.perso.mvc;

import fr.perso.mvc.IoC.Address;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcApplication.class, args);
	}
	@Bean(name = "address")
	public Address getAddress() {
		return new Address("Rue de la Paix", "Paris", 95000);
	}
}
