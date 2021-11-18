package com.tender.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tender.beans.Contractor;
import com.tender.beans.ContractorLogin;

public interface ContractorDao extends JpaRepository<Contractor,Integer>{
	
	public List<Contractor> findByConUsernameAndConPassword(String conusername,String conpassword);

}
