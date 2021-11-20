package com.tender.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tender.beans.UserTender;
import com.tender.repo.UserTenderDao;

@Service
public class UserTenderServiceImpl implements UserTenderService{
	
	@Autowired
	private UserTenderDao uDao;

	@Override
	public UserTender registerUserTender(UserTender s) {
		// TODO Auto-generated method stub
		return uDao.save(s);
	}

	@Override
	public List<UserTender> getAllusertenders() {
		// TODO Auto-generated method stub
		return uDao.findAll();
	}

	@Override
	public List<UserTender> findByUserId(Integer userId) {
		// TODO Auto-generated method stub
		return uDao.findByUserId(userId);
	}

	@Override
	public List<UserTender> findByConId(Integer conId) {
		// TODO Auto-generated method stub
		return uDao.findByConId(conId);
	}

	

}
