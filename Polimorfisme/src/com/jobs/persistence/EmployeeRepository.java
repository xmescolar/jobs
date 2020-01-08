package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members = new ArrayList<AbsStaffMember>();
	
	//Constructor
	public EmployeeRepository(List<AbsStaffMember> members){
		EmployeeRepository.members = members; // this.members = members;
	}
	
	//Constructor no parameters
	public EmployeeRepository() {
		EmployeeRepository.members = new ArrayList<AbsStaffMember>();
	}

	public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}	
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}

	public List<AbsStaffMember> getMembers() {
		return members;
	}

	public static void setMembers(List<AbsStaffMember> members) {
		EmployeeRepository.members = members;
	}	
}
