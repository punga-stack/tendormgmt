package com.tender.service;

import com.tender.beans.Contractor;
import com.tender.beans.Signup;

public interface SignupService {
	
	public Signup registerSignup(Signup s);
	
	public Signup findBySusernameAndPwd(String susername,String pwd);
	
	public Signup findBySidAndSusername(Integer sid,String susername);

}
