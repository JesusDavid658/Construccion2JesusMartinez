package app.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domains.entity.OrderEntity;



public interface ProductRepository extends JpaRepository<OrderEntity, Long> {
	
	 boolean existsByName(String name);
	
	
	
	
	
	
	
	
	

}
