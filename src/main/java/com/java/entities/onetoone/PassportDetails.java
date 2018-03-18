package com.java.entities.onetoone;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "passport_details")
public class PassportDetails implements Serializable {

	private static final long serialVersionUID = 80259865078102539L;

	@Id
	@GeneratedValue(generator = "ForeignKeyGeneratorMyGenerator")
	@GenericGenerator(name = "ForeignKeyGeneratorMyGenerator", strategy = "foreign", parameters = {
			@Parameter(value = "personDetails", name = "property") })
	@Column(name = "PERSON_ID")
	private Integer personId;
	@Column(name = "passport_number")
	private String passportNumber;
	@Column(name = "passport_issue_date")
	@Temporal(TemporalType.DATE)
	private Date passportIssueDate;
	@Column(name = "passport_validity_date")
	@Temporal(TemporalType.DATE)
	private Date passportValidityDate;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID", referencedColumnName="PERSON_ID")
	private PersonDetails personDetails;

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public Date getPassportIssueDate() {
		return passportIssueDate;
	}

	public PersonDetails getPersonDetails() {
		return personDetails;
	}

	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}

	public void setPassportIssueDate(Date passportIssueDate) {
		this.passportIssueDate = passportIssueDate;
	}

	public Date getPassportValidityDate() {
		return passportValidityDate;
	}

	public void setPassportValidityDate(Date passportValidityDate) {
		this.passportValidityDate = passportValidityDate;
	}

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
}
