package app.domains.ports;


import app.domains.models.Person;

public interface AdministratorPorts {
	public boolean existPerson(long id);
	public boolean existAdministrator(String name);
	public void saveAdministrator(Person person);
	public Person findByDocument(long document);
	
	
	

}
