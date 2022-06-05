package com.mindgate.main.loginDetails.service;

import java.util.List;

import com.mindgate.main.loginDetails.pojo.LoginDetails;




public interface LoginDetailsServiceInterFace {
	public boolean addLoginDetails(LoginDetails loginDetails);
	public boolean updateLoginDetails(LoginDetails loginDetails);
	public boolean deleteLoginDetails(int loginId);
	public LoginDetails getLoginDetailsByloginId(int loginId);
	public List<LoginDetails>getAllLoginDetails();
	
	
}
