package com.customer.model;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer_identities")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Identities {

	private String panCard;
	private Integer aadharCard;

	public String getPanCard() {
		return panCard;
	}
	public void setPanCard(String panCard) {
		this.panCard = panCard;
	}
	public Integer getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(Integer aadharCard) {
		this.aadharCard = aadharCard;
	}

	
}
