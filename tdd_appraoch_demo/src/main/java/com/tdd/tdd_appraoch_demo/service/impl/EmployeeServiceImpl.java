package com.tdd.tdd_appraoch_demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tdd.tdd_appraoch_demo.entity.Employee;
import com.tdd.tdd_appraoch_demo.repo.EmployeeRepo;
import com.tdd.tdd_appraoch_demo.service.EmployeeService;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2025
 */

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployee(Integer empId) throws Exception{
		 Employee employee = employeeRepo.findById(empId).get();
		 if(employee !=null) {
			 return employee;
		 }else {
			 throw new RuntimeException("Employee not found");
		 }
	}

	@Override
	public Employee editEmployee(Integer empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmp(Integer empId) {
		employeeRepo.deleteById(empId);
	}

}
