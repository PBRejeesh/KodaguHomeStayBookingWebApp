package com.luv2code.springdemo.model;

public class RoomTypeVO {
	
	String id;
	String name;
	public RoomTypeVO(String id, String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public String toString() {
		return "RoomTypeVO [id=" + id + ", name=" + name + "]";
	}
    
}
