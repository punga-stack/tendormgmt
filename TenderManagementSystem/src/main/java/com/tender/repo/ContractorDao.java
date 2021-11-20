package com.tender.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tender.beans.Contractor;

public interface ContractorDao extends JpaRepository<Contractor,Integer>{
	
	public Contractor findByConUsernameAndConPassword(String conusername,String conpassword);
	
	public Contractor findByConId(Integer conId);

}
