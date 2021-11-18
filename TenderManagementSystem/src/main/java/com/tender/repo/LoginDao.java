package com.tender.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tender.beans.AdminLogin;
import com.tender.beans.Contractor;

public interface LoginDao extends JpaRepository<AdminLogin,Integer>{
	
	

}
