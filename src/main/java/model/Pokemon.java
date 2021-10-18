package model;

import java.io.Serializable;

public class Pokemon implements Serializable {
 
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Pokemon(String name) {
		super();
		this.name = name;
	}
	
	
}
