package com.tender.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tender.beans.Contractor;
import com.tender.beans.Tender;

public interface TenderDao extends JpaRepository<Tender,Integer>{
	
	public Tender findByTenderId(Integer tenderId);
	
	public List<Tender> findByConId(Integer conId);

}
