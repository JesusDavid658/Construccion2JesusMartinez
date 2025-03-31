package app.domains.models;

import java.sql.Date;

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
	private String nameMedication;
	private double doseMedication;
	private Date dateOrder;
	public Order(long idOrder, long idPet, long idPerson, long idVeterinarian, String nameMedication,
			double doseMedication, Date date) {
		super();
		this.idOrder = idOrder;
		this.idPet = idPet;
		this.idPerson = idPerson;
		this.idVeterinarian = idVeterinarian;
		this.nameMedication = nameMedication;
		this.doseMedication = doseMedication;
		this.dateOrder = date;
	}
	public long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}
	public long getIdPet() {
		return idPet;
	}
	public void setIdPet(long idPet) {
		this.idPet = idPet;
	}
	public long getIdPerson() {
		return idPerson;
	}
	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}
	public long getIdVeterinarian() {
		return idVeterinarian;
	}
	public void setIdVeterinarian(long idVeterinarian) {
		this.idVeterinarian = idVeterinarian;
	}
	public String getNameMedication() {
		return nameMedication;
	}
	public void setNameMedication(String nameMedication) {
		this.nameMedication = nameMedication;
	}
	public double getDoseMedication() {
		return doseMedication;
	}
	public void setDoseMedication(double doseMedication) {
		this.doseMedication = doseMedication;
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	
	
	
	

}
