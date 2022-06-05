package com.mindgate.main.loginDetails.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.loginDetails.pojo.LoginDetails;


public class LoginDetailRowMapper implements RowMapper<LoginDetails> {

	@Override
	public LoginDetails mapRow(ResultSet resultSet, int i) throws SQLException {
		 int loginId=resultSet.getInt("LOGIN_ID")   ;
		 String password= resultSet.getString("PASSWORD") ;
		 String role=resultSet.getString("ROLE");
		 LoginDetails loginDetails = new LoginDetails(loginId,password,role);
		return loginDetails;
	}

}





