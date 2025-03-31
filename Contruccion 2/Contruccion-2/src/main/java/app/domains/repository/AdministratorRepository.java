package app.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domains.entity.PersonEntity;


public interface AdministratorRepository extends JpaRepository<PersonEntity, Long> {
	
	boolean existPersonById(long id);
	
	public PersonEntity findByid (long id);
	
	

}
