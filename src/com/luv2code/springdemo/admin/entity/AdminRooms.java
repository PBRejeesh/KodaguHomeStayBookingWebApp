package com.luv2code.springdemo.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="homestayrooms")
public class AdminRooms {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="roomId")
	private int roomid;
	
	@Column(name="floor")
	private int floor;
	
	@Column(name="room_block")
	private String block;
	
	@Column(name="room_key")
	private String key;
	
	@Column(name="roomt_ype")
	private String type;
	
	@Column(name="room_desc")
	private String description;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="room_number")
    private String roomNumber;
	
	@Column(name="room_active")
	private boolean roomActive;
	
	@Override
	public String toString() {
		return "AdminRooms [floor=" + floor + ", block=" + block + ", key=" + key + ", type=" + type + ", description="
				+ description + ", amount=" + amount + "]";
	}


	public int getRoomid() {
		return roomid;
	}


	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}


	public int getFloor() {
		return floor;
	}


	public void setFloor(int floor) {
		this.floor = floor;
	}


	public String getBlock() {
		return block;
	}


	public void setBlock(String block) {
		this.block = block;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getRoomNumber() {
		return roomNumber;
	}


	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}


	public boolean isRoomActive() {
		return roomActive;
	}


	public void setRoomActive(boolean roomActive) {
		this.roomActive = roomActive;
	}
	

}
