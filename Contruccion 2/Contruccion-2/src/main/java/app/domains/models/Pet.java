package app.domains.models;

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
	public String getNamePet() {
		return namePet;
	}
	public void setNamePet(String namePet) {
		this.namePet = namePet;
	}
	public long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}
	public long getAgePet() {
		return agePet;
	}
	public void setAgePet(long agePet) {
		this.agePet = agePet;
	}
	public long getIdPet() {
		return idPet;
	}
	public void setIdPet(long idPet) {
		this.idPet = idPet;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getCharacteristics() {
		return characteristics;
	}
	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	
	

	
	
	
	

}
