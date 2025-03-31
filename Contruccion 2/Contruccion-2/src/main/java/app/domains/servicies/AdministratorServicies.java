package app.domains.servicies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domains.models.Person;
import app.domains.ports.PersonPorts;
import app.domains.ports.AdministratorPorts;

import lombok.Getter;
import lombok.NoArgsConstructor;





@Getter
@NoArgsConstructor
@Service


public class AdministratorServicies {
	
	
	@Autowired
    private PersonPorts personPorts;
	@Autowired
	private AdministratorPorts administratorPorts;
	
	
	
	
	public void registerMedicalSeller(Person person ) throws Exception {
		if(personPorts.existPerson(person.getId())) {
			throw new Exception("Ya existe esa identificacion");
		}
		if(administratorPorts.existAdministrator(person.getName())) {
			throw new Exception("Ya existe alguien con ese nombre");
		}
		
		personPorts.savePerson(person);
		administratorPorts.saveAdministrator(person);
		
		
		
	}
	
	
	

}
