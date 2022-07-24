package com.luv2code.springdemo.admin.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.admin.dao.AdminRoomDao;
import com.luv2code.springdemo.admin.entity.AdminRooms;

@Service
public class AdminRoomServiceImpl implements AdminRoomService {

	@Autowired 
	private AdminRoomDao adminRoomDao;
	
	@Override
	@Transactional
	public List<AdminRooms> getAdminRooms() {
		return adminRoomDao.getAdminRooms();
	}

	@Override
	@Transactional
	public void saveAdminRoom(AdminRooms theRooms) {
		adminRoomDao.saveAdminRooms(theRooms);		
	}

	@Override
	@Transactional
	public AdminRooms getAdminRoom(int theRoomId) {
		return adminRoomDao.getAdminRoom(theRoomId);
	}

	@Override
	@Transactional
	public void deleteAdminRoom(int theRoomId) {
	    adminRoomDao.deleteAdminRoom(theRoomId);		
	}

	@Override
	@Transactional
	public Map<Integer, String> getRoomList() {
		return adminRoomDao.getListOfRoom();
	}
	
	

}
