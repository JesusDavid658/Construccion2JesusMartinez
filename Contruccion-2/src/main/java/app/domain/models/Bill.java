package app.domain.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor


public class Bill {
	private long idBill;
	private long idpet;
	private long idPerson;
	private long idOrder;
	private String product;
	private double worth;
	private long amount;
	private Date dateBill;
	
	
}
