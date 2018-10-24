package com.example.jpa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Embeddable
public class EmployeeIdentity implements Serializable {

	private static final long serialVersionUID = 6037787599017605568L;

	@NotNull
	@Size (max = 20)
	private String employeeId;
	
	@NotNull
	@Size (max = 20)
	private String companyId;

	public EmployeeIdentity(@NotNull @Size(max = 20) String employeeId, @NotNull @Size(max = 20) String companyId) {
		super();
		this.employeeId = employeeId;
		this.companyId = companyId;
	}

	public EmployeeIdentity() {
		super();
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((companyId == null) ? 0 : companyId.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeIdentity other = (EmployeeIdentity) obj;
		if (companyId == null) {
			if (other.companyId != null)
				return false;
		}
		else if (!companyId.equals(other.companyId))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		}
		else if (!employeeId.equals(other.employeeId))
			return false;
		return true;
	}
	
	

}
