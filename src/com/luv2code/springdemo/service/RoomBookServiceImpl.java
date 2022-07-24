package com.luv2code.springdemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luv2code.springdemo.dao.RoomBookDao;
import com.luv2code.springdemo.entity.HomeStayCustomer;

@Service
public class RoomBookServiceImpl implements RoomBookService {

	@Autowired
	private RoomBookDao roomBook;
	
	@Override
	@Transactional
	public List<HomeStayCustomer> getCustomers() {
		return roomBook.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(HomeStayCustomer theCustomer) {
		roomBook.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public HomeStayCustomer getCustomer(int theId) {
		return roomBook.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		roomBook.deleteCustomer(theId);

	}

}
