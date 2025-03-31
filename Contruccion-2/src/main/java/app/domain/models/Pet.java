package app.domain.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Pet {
	private String namePet;
	private long idPerson;
	private long agePet;
	private long idPet;
	private String species;
	private String race;
	private String characteristics;
	private double weight;
	public Pet(String namePet, long idPerson, long agePet, long idPet, String species, String race,
			String characteristics, double weight) {
		super();
		this.namePet = namePet;
		this.idPerson = idPerson;
		this.agePet = agePet;
		this.idPet = idPet;
		this.species = species;
		this.race = race;
		this.characteristics = characteristics;
		this.weight = weight;
	}
	
	
	
	
	
	

	
	
	
	

}
