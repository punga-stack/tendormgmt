package com.tender.service;

import java.util.List;

import com.tender.beans.Signup;
import com.tender.beans.Tender;
import com.tender.beans.UserTender;

public interface UserTenderService {
	
	public UserTender registerUserTender(UserTender s);
	
	public List<UserTender> getAllusertenders();
	
	public List<UserTender> findByUserId(Integer userId);
	
	public List<UserTender>findByConId(Integer conId);

}
