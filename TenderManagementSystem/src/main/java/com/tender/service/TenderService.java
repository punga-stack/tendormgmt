package com.tender.service;

import java.util.List;

import com.tender.beans.Tender;
import com.tender.exceptions.TenderNotFoundException;

public interface TenderService {
	
	public List<Tender> getAlltenders() throws TenderNotFoundException;
	
	public Tender findByTenderId(Integer tenderId);
	
	public List<Tender> findByConId(Integer conId);
}
