package com.luv2code.springdemo.admin.dao;

import java.util.List;
import java.util.Map;

import com.luv2code.springdemo.admin.entity.AdminRooms;

public interface AdminRoomDao {
	public List<AdminRooms> getAdminRooms();

	public void saveAdminRooms(AdminRooms rooms);

	public AdminRooms getAdminRoom(int theId);

	public void deleteAdminRoom(int theId);

	public Map<Integer, String> getListOfRoom();

}
