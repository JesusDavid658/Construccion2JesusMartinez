package app.domains.servicies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import app.domains.models.ClinicalHistory;
import app.domains.models.Order;
import app.domains.ports.ClinicalHistoryPorts;
import app.domains.ports.OrderPorts;
import app.domains.ports.UserPort;


@Setter
@Getter
@NoArgsConstructor
@Service




public class ClinicalHistoryService {
	
	
	
	@Autowired
	private ClinicalHistoryPorts clinicalHistory;
	
	@Autowired
	private OrderPorts orderPorts;
	
	@Autowired
	private UserPort userPorts;
	
	
	
	
	public void CreateClinicalHistory(ClinicalHistory clinicalHistory) throws Exception {
		userPorts =orderPorts.findById(ClinicalHistory.getIdOrder().getUserId());
		if(Vet == null || !vet.getuserPort()equals("vet")) {
			throw new Exception("El usuario no es veterinario");
		}
				
		
	}
	
	
	

}
