package com.bootcamp.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import builder.UsuarioBuilder;
import model.Usuario;

@SpringBootApplication
public class PatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
		Usuario usuario= new UsuarioBuilder().build("Pepe", "pepe@gamil.com", "98089793", "C/La Solana N13");
		
	}

}
