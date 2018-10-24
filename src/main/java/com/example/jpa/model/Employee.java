package com.example.jpa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name = "employees")
public class Employee implements Serializable {

	private static final long serialVersionUID = 4272425415166397857L;

	@EmbeddedId
	private EmployeeIdentity employeeIdentity;

	@NotNull
	@Size(max = 60)
	@Email
	private String email;

	@NotNull
	@Size(max = 60)
	private String name;

	@NotNull
	@Size(max = 60)
	private long phoneNumber;

	public Employee(EmployeeIdentity employeeIdentity, @NotNull @Size(max = 60) @Email String email,
			@NotNull @Size(max = 60) String name, @NotNull @Size(max = 60) long phoneNumber) {
		super();
		this.employeeIdentity = employeeIdentity;
		this.email = email;
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public Employee() {
		super();
	}

	public EmployeeIdentity getEmployeeIdentity() {
		return employeeIdentity;
	}

	public void setEmployeeIdentity(EmployeeIdentity employeeIdentity) {
		this.employeeIdentity = employeeIdentity;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
