package app.domains.ports;



import app.domains.models.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor


public interface ProductPorts {
	public String existMedication(String nameMedication);
	

}
