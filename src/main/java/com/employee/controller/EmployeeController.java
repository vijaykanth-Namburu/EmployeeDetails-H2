package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Dao.EmployeeService;
import com.employee.model.Employee;



@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	
	@GetMapping(value="/getEmployees")
 	public List<Employee> findAll()
 	{
		
		List<Employee> employees = employeeservice.getEmployees();
 		return employees;
 	}
	
	@PostMapping(value="/insertEmployee")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return employeeservice.insertEmployee(employee);
	}
	
	
	@PutMapping(value="/updateEmployee/{eid}")
	public Employee editEmployee(@RequestBody Employee employee, @PathVariable("eid") Long eid){
		return employeeservice.updateEmployee(employee, eid);
		
	}

	@DeleteMapping(value="/deleteById/{eid}")
	public void delete(@PathVariable("eid") Long eid){
		
		employeeservice.deleteEmployeeById(eid);
	}
	
	
 
}
