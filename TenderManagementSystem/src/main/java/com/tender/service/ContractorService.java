package com.tender.service;

import com.tender.beans.Contractor;

public interface ContractorService {
	
	public Contractor findByConUsernameAndConPassword(String conusername,String conpassword);
	
	public Contractor findByConId(Integer conId);
	
}
