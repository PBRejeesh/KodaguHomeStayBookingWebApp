package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customeridproffmapping")
public class VerificationId {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCustProffMap")
	private int id;

	@Column(name = "custId")
	private int customerId;

	@Column(name = "idProffId")
	private int idProffNameId;

	@Column(name = "idNumber")
	private String idNumber;

	@Column(name = "IdDetails")
	private String idDetails;

	public VerificationId() {
	}

	public VerificationId(int customerId, int idProffNameId, String idNumber, String idDetails) {
		this.customerId = customerId;
		this.idProffNameId = idProffNameId;
		this.idNumber = idNumber;
		this.idDetails = idDetails;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getIdProffNameId() {
		return idProffNameId;
	}

	public void setIdProffNameId(int idProffNameId) {
		this.idProffNameId = idProffNameId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(String idDetails) {
		this.idDetails = idDetails;
	}

}
