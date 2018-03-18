package com.java.onetoone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entities.onetoone.PassportDetails;
import com.java.onetoone.dao.PassportDao;
import com.java.onetoone.service.PassportService;

@Service("passportService")
public class PassportServiceImpl implements PassportService{
	@Autowired
	PassportDao passportDao;

	public void savePassport(PassportDetails passportDetails) {
		passportDao.savePassport(passportDetails);
	}


}
