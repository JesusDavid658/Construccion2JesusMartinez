package app.domains.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class ClinicalHistory {
	private int date;
	private String doctor;
	private String reason;
	private String symptoms;
	private String procedure;
	private String medicine;
	private int dose;
	private long idOrden;
	private String vaccine;
	private List <String> allergyMedication;
	private List <String> procedureDetails;
	private boolean cancelOrden;
	public ClinicalHistory(int date, String doctor, String reason, String symptoms, String procedure, String medicine,
			int dose, long idOrden, String vaccine, List<String> allergyMedication, List<String> procedureDetails,
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
		this.allergyMedication = allergyMedication;
		this.procedureDetails = procedureDetails;
		this.cancelOrden = cancelOrden;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getDoctor() {
		return doctor;
	}
	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getProcedure() {
		return procedure;
	}
	public void setProcedure(String procedure) {
		this.procedure = procedure;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public int getDose() {
		return dose;
	}
	public void setDose(int dose) {
		this.dose = dose;
	}
	public long getIdOrden() {
		return idOrden;
	}
	public void setIdOrden(long idOrden) {
		this.idOrden = idOrden;
	}
	public String getVaccine() {
		return vaccine;
	}
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	public List<String> getAllergyMedication() {
		return allergyMedication;
	}
	public void setAllergyMedication(List<String> allergyMedication) {
		this.allergyMedication = allergyMedication;
	}
	public List<String> getProcedureDetails() {
		return procedureDetails;
	}
	public void setProcedureDetails(List<String> procedureDetails) {
		this.procedureDetails = procedureDetails;
	}
	public boolean isCancelOrden() {
		return cancelOrden;
	}
	public void setCancelOrden(boolean cancelOrden) {
		this.cancelOrden = cancelOrden;
	}
	
	
	
	
	
	
	
	}
	
	
	
	




	
	
	
	
	


