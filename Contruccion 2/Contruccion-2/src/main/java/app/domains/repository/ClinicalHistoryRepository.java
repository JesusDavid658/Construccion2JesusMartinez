package app.domains.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import app.domains.entity.ClinicalHistoryEntity;

public interface ClinicalHistoryRepository extends JpaRepository<ClinicalHistoryEntity, Long> {
	
	
	
	

}
