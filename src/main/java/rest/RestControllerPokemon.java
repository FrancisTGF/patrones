package rest;

import java.net.URL;

import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Pokemon;

public class RestControllerPokemon {
	
	RestTemplate restTemplate = new RestTemplate();
	
	String fooResourceUrl = "https://pokeapi.co/api/v2/pokemon";
	
	ResponseEntity<String> response
	  = restTemplate.getForEntity(fooResourceUrl , String.class);
	
	
	ObjectMapper mapper = new ObjectMapper();
	JsonNode root = mapper.readTree(response.getBody());
	JsonNode name = root.path("name");
	
	Pokemon pokemon = restTemplate.getForObject(fooResourceUrl , Pokemon.class);
	
		
	
	
	URL url = new URL("https://pokeapi.co/api/v2/pokemon");
	RestTemplateBuilder restTemplateBuild = new RestTemplateBuilder();

	
	
	
}
