package com.luv2code.springdemo.admin.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.admin.entity.AdminRooms;

@Repository
public class AdminRoomDaoImpl implements AdminRoomDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<AdminRooms> getAdminRooms() {
		Session currentSession=sessionFactory.getCurrentSession();		
		Query<AdminRooms> theQuery=currentSession.createQuery("from AdminRooms",AdminRooms.class);		
		List<AdminRooms> roomList=theQuery.getResultList();
		return roomList;
	}

	@Override
	public void saveAdminRooms(AdminRooms rooms) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(rooms);
		
	}

	@Override
	public AdminRooms getAdminRoom(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		AdminRooms rooms=currentSession.get(AdminRooms.class, theId);
		return rooms;
	}

	@Override
	public void deleteAdminRoom(int theId) {
		Session currentSession=sessionFactory.getCurrentSession();
		Query theQury=currentSession.createQuery("delete from AdminRooms where roomid=:adminRoomId");
		theQury.setParameter("adminRoomId", theId);
		theQury.executeUpdate();
		
	}

	@Override
	public Map<Integer, String> getListOfRoom() {
		Map<Integer,String> map=new HashMap<Integer, String>();
		Session currentSession=sessionFactory.getCurrentSession();
		Query<AdminRooms> theQuery=currentSession.createQuery("from AdminRooms where roomActive=0",AdminRooms.class);
		List<AdminRooms> list=theQuery.getResultList();
		Iterator<AdminRooms> it=list.iterator();
		while(it.hasNext())
		{
			AdminRooms ar=it.next();
			map.put(ar.getRoomid(), ar.getRoomNumber());
		}
		return map;
	}

}
