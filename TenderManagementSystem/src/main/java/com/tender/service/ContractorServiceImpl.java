package com.tender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tender.beans.Contractor;
import com.tender.repo.ContractorDao;

@Service
public class ContractorServiceImpl implements ContractorService{
	
	@Autowired
	private ContractorDao conDao;

	@Override
	public Contractor findByConUsernameAndConPassword(String conusername, String conpassword) {
		// TODO Auto-generated method stub
		return conDao.findByConUsernameAndConPassword(conusername, conpassword);
	}

	@Override
	public Contractor findByConId(Integer conId) {
		// TODO Auto-generated method stub
		return conDao.findByConId(conId);
	}

	

	

}
