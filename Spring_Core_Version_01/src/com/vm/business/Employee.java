package com.vm.business;
import java.util.*;
public class Employee {
	
	
	Address address;
private int eid;
	
	private String ename,mobile,email;
	
	List<String> projects;

	
	public List<String> getProjects() {
		return projects;
	}

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + ", eid=" + eid + ", ename=" + ename + ", mobile=" + mobile + ", email="
				+ email + ", projects=" + projects + "]";
	}

	

	
	
	
	
	
	
	
	
	
}
