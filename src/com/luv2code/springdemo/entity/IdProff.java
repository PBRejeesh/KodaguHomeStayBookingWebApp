package com.luv2code.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "id_proff")
public class IdProff {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int proffId;

	@Column(name = "name")
	private String proffIdName;

	public IdProff() {

	}

	public IdProff(String proffIdName) {
		this.proffIdName = proffIdName;
	}

	public int getProffId() {
		return proffId;
	}

	public void setProffId(int proffId) {
		this.proffId = proffId;
	}

	public String getProffIdName() {
		return proffIdName;
	}

	public void setProffIdName(String proffIdName) {
		this.proffIdName = proffIdName;
	}

}
