package com.tender.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tender.beans.Signup;

public interface SignupDao extends JpaRepository<Signup,Integer>{
	
	public Signup findBySusernameAndPwd(String susername, String pwd);
	
	public Signup findBySidAndSusername(Integer sid,String susername);

}
