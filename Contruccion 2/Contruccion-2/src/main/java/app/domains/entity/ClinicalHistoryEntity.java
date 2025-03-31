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
@Table (name = "ClinicalHistory" )

public class ClinicalHistoryEntity {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Date")
	private Date date;
	
	
	@Column(name = "Doctor")
	private String Doctor;
	
	
	@Column(name = "Reason")
	private String Reason;
	
	
	@Column(name = "symptoms")
	private String symptoms;
	
	
	@Column(name = "Medicine")
	private String Medicine;
	
	
	@Column(name = "Dose")
	private int Dose;
	
	
	@Column(name = "IdOrder")
	private long IdOrder;
	
	
	@Column(name = "Vaccine")
	private String Vaccine;
	
	
	@Column(name = "allergyMedication")
	private String allergyMedication;
	
	@Column(name = "procedureDetails")
	private String procedureDetails;
	
	@Column(name = "cancelOrden")
	private boolean cancelOrden;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDoctor() {
		return Doctor;
	}

	public void setDoctor(String doctor) {
		Doctor = doctor;
	}

	public String getReason() {
		return Reason;
	}

	public void setReason(String reason) {
		Reason = reason;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getMedicine() {
		return Medicine;
	}

	public void setMedicine(String medicine) {
		Medicine = medicine;
	}

	public int getDose() {
		return Dose;
	}

	public void setDose(int dose) {
		Dose = dose;
	}

	public long getIdOrden() {
		return IdOrder;
	}

	public void setIdOrden(long idOrden) {
		IdOrder = idOrden;
	}

	public String getVaccine() {
		return Vaccine;
	}

	public void setVaccine(String vaccine) {
		Vaccine = vaccine;
	}

	public String getAllergyMedication() {
		return allergyMedication;
	}

	public void setAllergyMedication(String allergyMedication) {
		this.allergyMedication = allergyMedication;
	}

	public String getProcedureDetails() {
		return procedureDetails;
	}

	public void setProcedureDetails(String procedureDetails) {
		this.procedureDetails = procedureDetails;
	}

	public boolean isCancelOrden() {
		return cancelOrden;
	}

	public void setCancelOrden(boolean cancelOrden) {
		this.cancelOrden = cancelOrden;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
