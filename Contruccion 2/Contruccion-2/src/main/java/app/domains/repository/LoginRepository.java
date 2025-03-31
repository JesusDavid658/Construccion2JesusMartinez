package app.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domains.entity.UserEntity;

public interface LoginRepository extends JpaRepository<UserEntity, Long> {
	
	public boolean existsByuserName(String Username);
	public long LoginEntity(String user);
	
	
	
	
	
	
	
	
	

}
