package app.domains.ports;

import app.domains.models.Person;

public interface PersonPorts {
	public boolean existPerson(long id);
	public void savePerson(Person person);
	public Person findByDocument(long document);
	
	
	
	
	
	
	

}
