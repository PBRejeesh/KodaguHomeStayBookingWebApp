package com.luv2code.springdemo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="homestay_customer")
public class HomeStayCustomer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="stay_id")
	private int stay_id;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phno")
	private String phno;
	
	@Column(name="mobnumber")
	private String mobno;
	
	@Column(name="emailid")
	private String email;
	
	@Column(name="roomid")
	private int room_id;
	
	@Column(name="description")
	private String description;
	
	@Column(name="internationalTravler")
	private boolean interNationlTravler;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="custId")
	private List<VerificationId> idProffs;

	public HomeStayCustomer() {
	}

	public int getStay_id() {
		return stay_id;
	}

	public void setStay_id(int stay_id) {
		this.stay_id = stay_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getMobno() {
		return mobno;
	}

	public void setMobno(String mobno) {
		this.mobno = mobno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRoom_id() {
		return room_id;
	}

	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isInterNationlTravler() {
		return interNationlTravler;
	}

	public void setInterNationlTravler(boolean interNationlTravler) {
		this.interNationlTravler = interNationlTravler;
	}

	public List<VerificationId> getIdProffs() {
		return idProffs;
	}

	public void setIdProffs(List<VerificationId> idProffs) {
		this.idProffs = idProffs;
	}
	
	
	public void addIdProff(VerificationId id){
		if(idProffs==null){
			idProffs=new ArrayList<VerificationId>();
		}
		idProffs.add(id);
	}
	
	
	
}
