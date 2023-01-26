package com.employee.Dao;

import java.util.List;

import com.employee.model.Employee;


public interface EmployeeService {
	
List<Employee> getEmployees();
	
Employee insertEmployee(Employee employee);
	
Employee updateEmployee(Employee employee,Long eid);
	
void deleteEmployeeById(Long eid);

}
