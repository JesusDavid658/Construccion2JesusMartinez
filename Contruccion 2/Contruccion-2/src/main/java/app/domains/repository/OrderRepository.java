package app.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domains.entity.OrderEntity;



public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
	
	public boolean existOrder(long orderId);
	

}
