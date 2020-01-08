package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	// Constructor
	public JobsController(EmployeeRepository repository){
		this.repository = repository;			
	}
	
	public JobsController() {
		this.repository = new EmployeeRepository();
	}

	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee boss = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss); // No 
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(manager);
	}

	public void createVolunteer(String name, String address, String phone) throws Exception {
		//Employee volunteer = new Employee(name, address, phone,0,0);
		Employee volunteer = new Employee(name, address, phone, 0, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(volunteer);	
	}
	
	public void payAllEmployeers() {
		
		for(int i=0;i<repository.getMembers().size();i++) {
			repository.getMembers().get(i).pay();
		}	
		
	}

	public String getAllEmployees() {
		String employee = "";
		
		for(int i=0; i<repository.getMembers().size();i++) {
			employee = employee.concat("\n");
			employee += repository.getMembers().get(i).toString();
		}

		return employee;
	}

	public EmployeeRepository getRepository() {
		return repository;
	}

	public void setRepository(EmployeeRepository repository) {
		this.repository = repository;
	}

	@Override
	public String toString() {
		return "JobsController [repository=" + repository + "]";
	}
		
}
