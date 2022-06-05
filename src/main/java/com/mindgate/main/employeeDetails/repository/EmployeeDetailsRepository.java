package com.mindgate.main.employeeDetails.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.employeeDetails.pojo.EmployeeDetails;

@Repository
public class EmployeeDetailsRepository  implements EmployeeDetailsRepositoryInterface{
      
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private static final String INSERT_EmployeeDetails = "INSERT INTO employee_details(FIRST_NAME,LAST_NAME,ADDRESS,MANAGER_ID,\r\n"
			+ "CITY,STATE,EMAIL_ID,CONTACT_NO,DESIGNATION,LOGIN_ID) VALUES(?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_ALL_EmployeeDetails = "SELECT * FROM employee_details";
	private static final String SELECT_SINGLE_EmployeeDetails = "SELECT * FROM employee_details WHERE EMPLOYEE_ID = ?";
	private static final String UPDATE_EmployeeDetails = "UPDATE employee_details SET FIRST_NAME = ? , LAST_NAME = ? ,ADDRESS = ?,MANAGER_ID = ? , CITY = ?,STATE = ?,EMAIL_ID = ?,CONTACT_NO = ?, DESIGNATION = ?, LOGIN_ID = ?,WHERE EMPLOYEE_ID = ?";
	private static final String DELETE_EmployeeDetails = "DELETE employee_details WHERE EMPLOYEE_ID = ?";
	private int resultCount;
	@Override
	public boolean addEmployeeDetails(EmployeeDetails employeeDetails) {

		Object[] args = {employeeDetails.getFirstName(),employeeDetails.getLastName(),
			employeeDetails.getAddress(),employeeDetails.getManagerId(),employeeDetails.getCity(),employeeDetails.getState(),
			employeeDetails.getEmailId(),employeeDetails.getContactNo(),employeeDetails.getDesignation(),employeeDetails.getLoginDetails()};
		
		resultCount = jdbcTemplate.update(INSERT_EmployeeDetails, args);

		if (resultCount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean updateEmployeeDetails(EmployeeDetails employeeDetails) {
		return false;
	}

	@Override
	public boolean deleteEmployeeDetailsByemployeeDetailsId(int employeeDetailsId) {
		return false;
	}

	@Override
	public EmployeeDetails getEmployeeDetailsByemployeeDetailsId(int employeeDetailsId) {
		return null;
	}

	@Override
	public List<EmployeeDetails> getAllEmployeeDetails() {
		return null;
	}

}
