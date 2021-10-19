package rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Pokemon;

public class RestControllerPokemon {
	
	RestTemplate restTemplate = new RestTemplate();
	
	String fooResourceUrl = "https://pokeapi.co/api/v2/pokemon";
	
	ResponseEntity<String> response
	  = restTemplate.getForEntity(fooResourceUrl , String.class);
	
	
	ObjectMapper mapper = new ObjectMapper();
	

	/*JsonNode root = mapper.readTree(response.getBody());
	JsonNode name = root.path("name");*/
	
	Pokemon pokemon = restTemplate.getForObject(fooResourceUrl , Pokemon.class);
	

	
	
	
}
