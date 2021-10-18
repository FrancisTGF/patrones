package com.bootcamp.patrones;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import builder.UsuarioBuilder;
import model.Usuario;
import resilencia.UsuarioCircuitBreak;
import resilencia.UsuarioRetry;
import singleton.Singleton;
import singleton.UsuarioSingleton;

@SpringBootApplication
public class PatronesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatronesApplication.class, args);
	//Patron Builder
		Usuario usuario= new UsuarioBuilder().build("Pepe", "pepe@gmail.com", "98089793", "C/La Solana N13");
		System.out.println(usuario);
		
	//Patron Singleton
		Singleton singleton = Singleton.getSingletonInstance("Pepe");
		System.out.println(singleton);
		UsuarioSingleton usuario2 = UsuarioSingleton.getUsuarioInstance("Pepe", "pepe@gmail.com", "98089793", "C/La Solana N13");
		System.out.println(usuario2);		
		//forzamos el singleton
		usuario2.getUsuarioInstance("Juan", "pepe@gmail.com", "98089793", "C/La Solana N13");
		UsuarioSingleton usuario3 = UsuarioSingleton.getUsuarioInstance("Antonio", "pepe@gmail.com", "98089793", "C/La Solana N13");
		System.out.println(usuario3);
		
	//Patron Prototype
		List<Usuario> listUsuario = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Usuario userClone = usuario.clone();
			userClone.setNombre("Usuario "+ i);
			
			listUsuario.add(userClone);
			
		}
		for (Usuario value : listUsuario) {
			System.out.println(value);
			
		}
		
	//Resilencia
		//Retry
		System.out.println("¿La conexion se encuentra activada? : " + UsuarioRetry.retry(0)); 
		System.out.println("¿La conexion se encuentra activada? : " + UsuarioRetry.retry(1)); 
			
		
		//CircuitBreak
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreak(0)); 
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreak(1)); 
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreak(2)); 
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreak(3)); 
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreak(4));
			//Avanzado
		Usuario  usuario5= new Usuario("Pepe", "pepe@gmail.com", "98089793", "C/La Solana N13");
			//open
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreakAlimentarUsuario(UsuarioCircuitBreak.circuitBreak(0), usuario5)); 
			//half-open
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreakAlimentarUsuario(UsuarioCircuitBreak.circuitBreak(1), usuario5)); 
			//Closed
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreakAlimentarUsuario(UsuarioCircuitBreak.circuitBreak(2), usuario5)); 
			//Disabled
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreakAlimentarUsuario(UsuarioCircuitBreak.circuitBreak(3), usuario5)); 
			//Forced-open
		System.out.println("Estado : " + UsuarioCircuitBreak.circuitBreakAlimentarUsuario(UsuarioCircuitBreak.circuitBreak(4), usuario5)); 

		

		
	}

}
