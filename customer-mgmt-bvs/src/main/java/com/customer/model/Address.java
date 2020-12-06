package com.customer.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_address")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Address {

	private UUID addressId;
	private String city;
	private String state;
	private String country;

	public UUID getAddressId() {
		return addressId;
	}
	public void setAddressId(UUID addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
