package app.domain.models;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
public class Order {
	private long idOrder;
	private long idPet;
	private long idPerson;
	private long idVeterinarian;
	private String name_medication;
	private double dose_medication;
	private LocalDate dateOrder;
	public Order(long idOrder, long idPet, long idPerson, long idVeterinarian, String name_medication,
			double dose_medication, LocalDate date) {
		super();
		this.idOrder = idOrder;
		this.idPet = idPet;
		this.idPerson = idPerson;
		this.idVeterinarian = idVeterinarian;
		this.name_medication = name_medication;
		this.dose_medication = dose_medication;
		this.dateOrder = date;
	}
	
	
	

}
