package com.tdd.tdd_appraoch_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdd.tdd_appraoch_demo.entity.Employee;
import com.tdd.tdd_appraoch_demo.repo.EmployeeRepo;
import com.tdd.tdd_appraoch_demo.service.EmployeeService;

import jakarta.transaction.Transactional;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2025
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	@Transactional
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	@Transactional
	public Employee getEmployee(Integer empId) throws Exception{
		 Employee employee = employeeRepo.findById(empId).get();
		 if(employee !=null) {
			 return employee;
		 }else {
			 throw new RuntimeException("Employee not found");
		 }
	}

	@Override
	@Transactional
	public Employee editEmployee(Integer empId, Employee employee) {
		return null;
	}

	@Override
	@Transactional
	public void deleteEmp(Integer empId) {
		employeeRepo.deleteById(empId);
	}

}
