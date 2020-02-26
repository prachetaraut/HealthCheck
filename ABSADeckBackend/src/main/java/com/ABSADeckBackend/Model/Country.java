package com.ABSADeckBackend.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "health")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int countryId;
	
	@Column(length = 15)
	private String countryName;
	
	private String countryDescription;
	
	private LocalDateTime lastUpdatedDate;
	
	private int lastUpdatedUser;
	
	private boolean isValid;

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryDescription() {
		return countryDescription;
	}

	public void setCountryDescription(String countryDescription) {
		this.countryDescription = countryDescription;
	}

	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public int getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(int lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public Country() {
		super();
	}

	public Country(int countryId, String countryName, String countryDescription, LocalDateTime lastUpdatedDate,
			int lastUpdatedUser, boolean isValid) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryDescription = countryDescription;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastUpdatedUser = lastUpdatedUser;
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", countryName=" + countryName + ", countryDescription="
				+ countryDescription + ", lastUpdatedDate=" + lastUpdatedDate + ", lastUpdatedUser=" + lastUpdatedUser
				+ ", isValid=" + isValid + "]";
	}
	
}
