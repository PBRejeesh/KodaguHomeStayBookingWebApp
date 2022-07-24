package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.HomeStayCustomer;

public interface RoomBookDao {

	public List<HomeStayCustomer> getCustomers();

	public void saveCustomer(HomeStayCustomer theCustomer);

	public HomeStayCustomer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
