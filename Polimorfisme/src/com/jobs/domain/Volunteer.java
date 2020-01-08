package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	String description;
	
	//Constructor
	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
	}
	
	@Override
	public void pay() {	
	//	totalPaid = paymentRate.pay(salaryPerMonth);
	   	totalPaid = 0; // Volunteers don't have pay.
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Volunteer [description=" + description + ", id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ", totalPaid=" + totalPaid + ", getDescription()=" + getDescription()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}	

}
