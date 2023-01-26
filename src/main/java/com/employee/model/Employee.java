package com.employee.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Employee {
	
	@Id
	private Long eid;
	private String ename;
	private String eage;
	/*public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(Long eid, String ename, String eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEage() {
		return eage;
	}
	public void setEage(String eage) {
		this.eage = eage;
	}*/

}
