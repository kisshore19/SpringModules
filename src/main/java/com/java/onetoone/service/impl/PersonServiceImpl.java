package com.java.onetoone.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.entities.onetoone.PersonDetails;
import com.java.onetoone.dao.PersonDao;
import com.java.onetoone.service.PersonService;

@Service("personService")
public class PersonServiceImpl  implements PersonService{
	@Autowired
	PersonDao personDao;

	public void savePerson(PersonDetails personDetails) {
		personDao.savePerson(personDetails);
		
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
