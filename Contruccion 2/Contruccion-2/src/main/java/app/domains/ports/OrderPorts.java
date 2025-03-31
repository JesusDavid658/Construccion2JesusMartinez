package app.domains.ports;


import app.domains.models.Seller;
import app.domains.models.Order;


public interface OrderPorts {
	
	public boolean existOrder(long OrdenId);
	public Order findById(long OrdenId);
	public void saveOrder(Order order);
	Order getOrderById(long id);
	 
	boolean existMedication(String nameMedication);
	

}
