package com.bootcamp.patrones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import builder.UsuarioBuilder;
import model.Usuario;
import singleton.Singleton;
import singleton.UsuarioSingleton;

@SpringBootApplication
public class PatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
		Usuario usuario= new UsuarioBuilder().build("Pepe", "pepe@gmail.com", "98089793", "C/La Solana N13");
		System.out.println(usuario);
		Singleton singleton = Singleton.getSingletonInstance("Pepe");
		System.out.println(singleton);
		UsuarioSingleton usuario2 = UsuarioSingleton.getUsuarioInstance("Pepe", "pepe@gmail.com", "98089793", "C/La Solana N13");
		System.out.println(usuario2);
		//forzamos el singleton
		usuario2.getUsuarioInstance("Juan", "pepe@gmail.com", "98089793", "C/La Solana N13");
		UsuarioSingleton usuario3 = UsuarioSingleton.getUsuarioInstance("Antonio", "pepe@gmail.com", "98089793", "C/La Solana N13");
		System.out.println(usuario3);
	}

}
