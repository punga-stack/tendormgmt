package com.tender.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tender.beans.Tender;
import com.tender.repo.TenderDao;


@Service
public class TenderServiceImpl implements TenderService {
	
	@Autowired
	private TenderDao tenDao;

	@Override
	public List<Tender> getAlltenders(){
		// TODO Auto-generated method stub
		return tenDao.findAll();
		
	}

	@Override
	public Tender findByTenderId(Integer tenderId) {
		// TODO Auto-generated method stub
		return tenDao.findByTenderId(tenderId);
	}

	@Override
	public List<Tender> findByConId(Integer conId) {
		// TODO Auto-generated method stub
		return tenDao.findByConId(conId);
	}

	
	
	

}
