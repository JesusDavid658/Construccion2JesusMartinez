package app.domains.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import app.domains.entity.SellerEntity;


public interface SellerRepository extends JpaRepository<SellerEntity, Long> {
	
	
	public void saveOrder(long idorder);
	

}
