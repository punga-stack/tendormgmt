package com.tender.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tender.beans.Tender;
import com.tender.beans.UserTender;

public interface UserTenderDao extends JpaRepository<UserTender,Integer>{
	
	public List<UserTender> findByUserId(Integer userId);
	
	public List<UserTender> findByConId(Integer conId);
	
}
