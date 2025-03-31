package app.domains.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name= "Order")




public class OrderEntity  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrder")
	private long idOrder;
	
	@Id
	@Column(name = "idPet")
	private String idPet;
	
	@Id
	@Column(name = "idPerson")
	private long idPerson;
	
	@Id
	@Column(name = "idVeterinarian")
	private long idVeterinarian;
	
	@Id
	@Column(name = "nameMedication")
	private String nameMedication;
	
	@Id
	@Column(name = "doseMedication")
	private long doseMedication;
	
	
	@Id
	@Column(name = "dateOrder")
	private Date dateOrder;


	public long getIdOrder() {
		return idOrder;
	}


	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}


	public String getIdPet() {
		return idPet;
	}


	public void setIdPet(String idPet) {
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


	public long getDoseMedication() {
		return doseMedication;
	}


	public void setDoseMedication(long doseMedication) {
		this.doseMedication = doseMedication;
	}


	public Date getDateOrder() {
		return dateOrder;
	}


	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	
	
	
	
	
	
	
	
	
	

}
