package com.luv2code.springdemo.admin.service;

import java.util.List;
import java.util.Map;

import com.luv2code.springdemo.admin.entity.AdminRooms;

public interface AdminRoomService {

	public List<AdminRooms> getAdminRooms();

	public void saveAdminRoom(AdminRooms theRooms);

	public AdminRooms getAdminRoom(int theRoomId);

	public void deleteAdminRoom(int theRoomId);

	public Map<Integer, String> getRoomList();

}
