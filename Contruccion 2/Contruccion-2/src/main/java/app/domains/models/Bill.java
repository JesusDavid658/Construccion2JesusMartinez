package app.domains.models;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor


public class Bill {
	private long idBill;
	private long idPet;
	private long idPerson;
	private long idOrder;
	private String product;
	private double worth;
	private long amount;
	private Date dateBill;
	public Bill(long idBill, long idpet, long idPerson, long idOrder, String product, double worth, long amount,
			Date dateBill) {
		super();
		this.idBill = idBill;
		this.idPet = idpet;
		this.idPerson = idPerson;
		this.idOrder = idOrder;
		this.product = product;
		this.worth = worth;
		this.amount = amount;
		this.dateBill = dateBill;
	}
	public long getIdBill() {
		return idBill;
	}
	public void setIdBill(long idBill) {
		this.idBill = idBill;
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
	public long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(long idOrder) {
		this.idOrder = idOrder;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getWorth() {
		return worth;
	}
	public void setWorth(double worth) {
		this.worth = worth;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public Date getDateBill() {
		return dateBill;
	}
	public void setDateBill(Date dateBill) {
		this.dateBill = dateBill;
	}
	
	
	
	
	
	
}
