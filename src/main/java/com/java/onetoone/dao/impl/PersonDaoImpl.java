package com.java.onetoone.dao.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.java.common.dao.AbstractDao;
import com.java.configuration.ConnectionFactory;
import com.java.entities.onetoone.PersonDetails;
import com.java.onetoone.dao.PersonDao;

@Repository
@Transactional
public class PersonDaoImpl extends AbstractDao implements PersonDao{

	@Autowired
	ConnectionFactory connectionFactory;
	
	public ConnectionFactory getConnectionFactory() {
		return connectionFactory;
	}

	public void setConnectionFactory(ConnectionFactory connectionFactory) {
		this.connectionFactory = connectionFactory;
	}

	
	public void savePerson(PersonDetails personDetails) {
		save(personDetails);
	}

	public PersonDetails findPerson(PersonDetails personDetails) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object updatePerson(PersonDetails personDetails) {
		// TODO Auto-generated method stub
		return null;
	}

}
