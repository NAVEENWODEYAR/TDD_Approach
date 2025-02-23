package com.tdd.tdd_appraoch_demo.service;

import org.springframework.stereotype.Service;

import com.tdd.tdd_appraoch_demo.entity.Employee;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2025
 */

@Service
public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	
	public Employee getEmployee(Integer empId) throws Exception;
	
	public Employee editEmployee(Integer empId, Employee employee);
	
	public void deleteEmp(Integer empId);
}
