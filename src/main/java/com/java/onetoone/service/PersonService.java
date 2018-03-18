package com.java.onetoone.service;

import com.java.entities.onetoone.PersonDetails;

public interface PersonService {
	public void savePerson(PersonDetails personDetails);

	public PersonDetails findPerson(PersonDetails personDetails);

	public Object updatePerson(PersonDetails personDetails);
}
