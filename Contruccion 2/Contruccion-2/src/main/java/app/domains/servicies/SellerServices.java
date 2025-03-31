package app.domains.servicies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.domains.models.Order;
import app.domains.ports.OrderPorts;
import app.domains.ports.ProductPorts;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;





@Setter
@Getter
@NoArgsConstructor
@Service


public class SellerServices {
	
	
	@Autowired
	private OrderPorts orderPorts;
	
	@Autowired 
	private ProductPorts productPorts;
	
	
	public void applyMedication(long Idorder, String sellerId) throws Exception {
        if (!orderPorts.existOrder(Idorder)) {
            throw new Exception("No se puede aplicar el medicamento, la orden no existe");
        }
    
        Order order = orderPorts.getOrderById(Idorder);
        
        System.out.println("El medicamento fue aplicado");

        

        
        
        
        orderPorts.saveOrder(order);
        
        
        
    
        
        
	}
	
	
	
	public void sellerMedication(String nameMedication)throws Exception {
		if(!productPorts.existMedication(nameMedication)) {
			throw new Exception ("El medicamento no existe");
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
