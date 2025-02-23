package com.tdd.tdd_appraoch_demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tdd.tdd_appraoch_demo.entity.Employee;
import com.tdd.tdd_appraoch_demo.repo.EmployeeRepo;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2025
 */

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceImplTest {
	
	@Mock
	EmployeeRepo employeeRepo;
	
	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;
	
	private static Employee employee;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("EmployeeServiceImplTest started");
		employee.setEmpName("Test");
		employee.setEmpAddress("Test_Address");
		employee.setEmpDept("Test_Dept");
		employee.setEmpDesignation("Test_Design");
		employee.setEmpMail("Test_Mail");
		employee.setEmpSal("Test_Sal");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("EmployeeServiceImplTest completed");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	@DisplayName("AddingEmployee")
	public void addEmployeeTest() {
	Mockito.when(employeeServiceImpl.addEmployee(employee)).thenReturn(employee);
	assertEquals(employee.getEmpName(), employee.getEmpName());
	assertNotNull(employee);
	}
	
	@Test
	@DisplayName("FindByID")
	public void getEmployee() throws Exception {
	Mockito.when(employeeServiceImpl.getEmployee(1)).thenReturn(employee);
	
	}
}
