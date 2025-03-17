package app.domain.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Clinical_History {
	private int date;
	private String doctor;
	private String reason;
	private String symptoms;
	private String procedure;
	private String medicine;
	private int dose;
	private long idOrden;
	private String vaccine;
	private List <String> allergymedication;
	private List <String> proceduredetails;
	private boolean cancelOrden;
	public Clinical_History(int date, String doctor, String reason, String symptoms, String procedure, String medicine,
			int dose, long idOrden, String vaccine, List<String> allergymedication, List<String> proceduredetails,
			boolean cancelOrden) {
		super();
		this.date = date;
		this.doctor = doctor;
		this.reason = reason;
		this.symptoms = symptoms;
		this.procedure = procedure;
		this.medicine = medicine;
		this.dose = dose;
		this.idOrden = idOrden;
		this.vaccine = vaccine;
		this.allergymedication = allergymedication;
		this.proceduredetails = proceduredetails;
		this.cancelOrden = cancelOrden;
	}
	
	
	
	
	}
	
	
	
	




	
	
	
	
	


