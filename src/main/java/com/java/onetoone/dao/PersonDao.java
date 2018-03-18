package com.java.onetoone.dao;

import com.java.entities.onetoone.PersonDetails;

public interface PersonDao {
	public void savePerson(PersonDetails personDetails);
	public PersonDetails findPerson(PersonDetails personDetails);
	public Object updatePerson(PersonDetails personDetails);
}
