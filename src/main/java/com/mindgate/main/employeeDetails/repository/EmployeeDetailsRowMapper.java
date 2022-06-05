package com.mindgate.main.employeeDetails.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.employeeDetails.pojo.EmployeeDetails;
import com.mindgate.main.loginDetails.pojo.LoginDetails;

public class EmployeeDetailsRowMapper implements RowMapper<EmployeeDetails> {
	
	public EmployeeDetails mapRow(ResultSet resultSet, int i)throws SQLException{
		 int employeeDetailsId=resultSet.getInt("EMPLOYEE_ID") ;
		 String firstName=resultSet.getString("FIRST_NAME");
		 String lastName=resultSet.getString("LAST_NAME");
		 String address=resultSet.getString("ADDRESS");
		 int managerId=resultSet.getInt("MANAGER_ID");
		 String city=resultSet.getString("CITY");
		 String state=resultSet.getString("STATE");
		 String emailId=resultSet.getString("EMAIL_ID");
		 String contactNo=resultSet.getString("CONTACT_NO");
		 String designation=resultSet.getString("DESIGNATION");
		LoginDetails LoginDetails=(com.mindgate.main.loginDetails.pojo.LoginDetails) resultSet.getObject(i);
        EmployeeDetails employeeDetails=new EmployeeDetails(employeeDetailsId, firstName, lastName, address, managerId, city, state, emailId, contactNo, designation, LoginDetails);
		return employeeDetails;
		
		
		
		
		
		
	}
	
	

}




