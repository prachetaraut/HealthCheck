package com.ABSADeckBackend.Model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parameter")
public class Parameter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int parameterId;
	
	@Column(length = 20)
	private String parameterName;
	
	private int applicationId;
	
	private String ParameterDescription;
	
	private LocalDateTime lastUpdatedDate;
	
	private int lastUpdatedUser;
	
	private boolean isValid;

	public int getParameterId() {
		return parameterId;
	}

	public void setParameterId(int parameterId) {
		this.parameterId = parameterId;
	}

	public String getParameterName() {
		return parameterName;
	}

	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getParameterDescription() {
		return ParameterDescription;
	}

	public void setParameterDescription(String parameterDescription) {
		ParameterDescription = parameterDescription;
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

	public Parameter() {
		super();
	}

	public Parameter(int parameterId, String parameterName, int applicationId, String parameterDescription,
			LocalDateTime lastUpdatedDate, int lastUpdatedUser, boolean isValid) {
		super();
		this.parameterId = parameterId;
		this.parameterName = parameterName;
		this.applicationId = applicationId;
		ParameterDescription = parameterDescription;
		this.lastUpdatedDate = lastUpdatedDate;
		this.lastUpdatedUser = lastUpdatedUser;
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Parameter [parameterId=" + parameterId + ", parameterName=" + parameterName + ", applicationId="
				+ applicationId + ", ParameterDescription=" + ParameterDescription + ", lastUpdatedDate="
				+ lastUpdatedDate + ", lastUpdatedUser=" + lastUpdatedUser + ", isValid=" + isValid + "]";
	}
	
}
