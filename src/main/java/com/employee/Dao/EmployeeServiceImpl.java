package com.employee.Dao;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;





@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	
	@Autowired
	private EmployeeRepository employeerepository;
	
	@Override
	public List<Employee> getEmployees() {
		
		return (List<Employee>) employeerepository.findAll();
	}

	

	
/*	@Override
	public Employee updateEmployee(Employee employee,Long eid) {
	
		Employee emp = employeerepository.findById(eid).get();
		if(emp.getEid()==eid) {
			emp.setEname(employee.getEname());
			emp.setEage(employee.getEage());
			emp.setEid(employee.getEid());
			employeerepository.save(emp);
		}else {
		return null;
		}
		return emp;
	}
	
	
	*/
	

	@Override
	public Employee insertEmployee(Employee employee) {
		//deleteEmployeeById(employee.getEid());
		return employeerepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee, Long eid) {

			try {
					
					Optional<Employee> emp = employeerepository.findById(eid);

			if(emp.isPresent()) {
					if (Objects.nonNull(employee.getEname()) && !"".equalsIgnoreCase(employee.getEname())) {
			            emp.get().setEname(employee.getEname());
			        }
			        
			        
			 
			        if (Objects.nonNull(employee.getEage()) && !"".equalsIgnoreCase(employee.getEage())) {
			            emp.get().setEage(employee.getEage());
			 
			       
			        }
			        return employeerepository.save(emp.get());
			       
					
					}
		}catch(Exception e) {
			
			throw e;
			
			
		}
				return null;
        
	}

	@Override
	public void deleteEmployeeById(Long eid) {
		employeerepository.deleteById(eid);

		
	}

	
	
	

}
