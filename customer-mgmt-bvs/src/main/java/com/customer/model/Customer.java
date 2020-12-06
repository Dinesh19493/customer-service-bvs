package com.customer.model;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {

	private UUID customerId;
	private String custFirstName;
	private String custLastName;
	private Integer custAge;
	private Address custAddress;
	private List<Identities> custIdentities;
	private List<CommModes> custCommModes;

	public UUID getCustomerId() {
		return customerId;
	}
	public void setCustomerId(UUID customerId) {
		this.customerId = customerId;
	}
	public String getCustFirstName() {
		return custFirstName;
	}
	public void setCustFirstName(String custFirstName) {
		this.custFirstName = custFirstName;
	}
	public String getCustLastName() {
		return custLastName;
	}
	public void setCustLastName(String custLastName) {
		this.custLastName = custLastName;
	}
	public Integer getCustAge() {
		return custAge;
	}
	public void setCustAge(Integer custAge) {
		this.custAge = custAge;
	}
	public Address getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(Address custAddress) {
		this.custAddress = custAddress;
	}
	public List<Identities> getCustIdentities() {
		return custIdentities;
	}
	public void setCustIdentities(List<Identities> custIdentities) {
		this.custIdentities = custIdentities;
	}
	public List<CommModes> getCustCommModes() {
		return custCommModes;
	}
	public void setCustCommModes(List<CommModes> custCommModes) {
		this.custCommModes = custCommModes;
	}
}
