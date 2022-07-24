package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.HomeStayCustomer;

public interface RoomBookService {
	public List<HomeStayCustomer> getCustomers();

	public void saveCustomer(HomeStayCustomer theCustomer);

	public HomeStayCustomer getCustomer(int theId);

	public void deleteCustomer(int theId);

}
