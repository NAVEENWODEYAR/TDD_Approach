package com.tdd.tdd_appraoch_demo.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Naveen K Wodeyar
 * @date 23-Feb-2025
 */

@Entity
@Table(name = "EMPLOYEE_TEST")
public class Employee {

	@Id
	private Integer empId;
	
	@Column(name = "EMPLOYEE_NAME")
	private String empName;

	@Column(name = "EMPLOYEE_DEPARTMENT")
	private String empDept;
	
	@Column(name = "EMPLOYEE_DESIGNATION")
	private String empDesignation;
	
	@Column(name = "EMPLOYEE_MAIL")
	private String empMail;
	
	@Column(name = "EMPLOYEE_ADDRESS")
	private String empAddress;
	
	@Column(name = "EMPLOYEE_SALARY")
	private String empSal;

	
	public Employee() {}
	
	/**
	 * @param empId
	 * @param empName
	 * @param empDept
	 * @param empDesignation
	 * @param empMail
	 * @param empAddress
	 * @param empSal
	 */
	public Employee(Integer empId, String empName, String empDept, String empDesignation, String empMail,
			String empAddress, String empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empDesignation = empDesignation;
		this.empMail = empMail;
		this.empAddress = empAddress;
		this.empSal = empSal;
	}



	/**
	 * @return the empId
	 */
	public Integer getEmpId() {
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}

	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	/**
	 * @return the empDesignation
	 */
	public String getEmpDesignation() {
		return empDesignation;
	}

	/**
	 * @param empDesignation the empDesignation to set
	 */
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	/**
	 * @return the empMail
	 */
	public String getEmpMail() {
		return empMail;
	}

	/**
	 * @param empMail the empMail to set
	 */
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * @return the empSal
	 */
	public String getEmpSal() {
		return empSal;
	}

	/**
	 * @param empSal the empSal to set
	 */
	public void setEmpSal(String empSal) {
		this.empSal = empSal;
	}


	@Override
	public int hashCode() {
		return Objects.hash(empAddress, empDept, empDesignation, empId, empMail, empName, empSal);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(empAddress, other.empAddress) && Objects.equals(empDept, other.empDept)
				&& Objects.equals(empDesignation, other.empDesignation) && Objects.equals(empId, other.empId)
				&& Objects.equals(empMail, other.empMail) && Objects.equals(empName, other.empName)
				&& Objects.equals(empSal, other.empSal);
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empDesignation="
				+ empDesignation + ", empMail=" + empMail + ", empAddress=" + empAddress + ", empSal=" + empSal + "]";
	}
	
	
	
	
}
