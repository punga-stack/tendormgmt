package com.tender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tender.beans.Signup;
import com.tender.repo.SignupDao;

@Service
public class SignupServiceImpl implements SignupService{
	
	@Autowired
	private SignupDao serv;

	@Override
	public Signup registerSignup(Signup s) {
		// TODO Auto-generated method stub
		return serv.save(s);
	}

	@Override
	public Signup findBySusernameAndPwd(String susername, String pwd) {
		// TODO Auto-generated method stub
		return serv.findBySusernameAndPwd(susername, pwd);
	}

	@Override
	public Signup findBySidAndSusername(Integer sid, String susername) {
		// TODO Auto-generated method stub
		return serv.findBySidAndSusername(sid, susername);
	}
	
	

}
