package com.customer.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "customer_comm_modes")
public class CommModes {

	private Integer contactNumber;
	private String email;

	public Integer getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Integer contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
