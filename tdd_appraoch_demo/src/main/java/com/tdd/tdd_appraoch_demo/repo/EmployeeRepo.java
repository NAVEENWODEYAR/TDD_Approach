package com.tdd.tdd_appraoch_demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tdd.tdd_appraoch_demo.entity.Employee;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2025
 */

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
