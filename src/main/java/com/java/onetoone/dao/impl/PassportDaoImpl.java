package com.java.onetoone.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDao;
import com.java.configuration.ConnectionFactory;
import com.java.entities.onetoone.PassportDetails;
import com.java.onetoone.dao.PassportDao;

@Repository
@Transactional
public class PassportDaoImpl extends AbstractDao implements PassportDao {
	
	@Autowired
	ConnectionFactory connectionFactory;
	
	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	
	public void savePassport(PassportDetails passportDetails){
		save(passportDetails);
	}
}
