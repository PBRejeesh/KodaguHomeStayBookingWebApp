package com.luv2code.springdemo.service;

import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.VerificationIdDao;

@Service
public class VerificationIdService {
	
	@Autowired
	private VerificationIdDao dao;
	
	@Transactional
	public Map<Integer,String> getVerificationId()
	{
		return dao.getVerificationId();
	}

}
