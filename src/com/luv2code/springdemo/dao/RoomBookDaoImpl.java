package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.HomeStayCustomer;

@Repository
public class RoomBookDaoImpl implements RoomBookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<HomeStayCustomer> getCustomers() {

		Session currentSession = sessionFactory.getCurrentSession();
		Query<HomeStayCustomer> theQuery = currentSession.createQuery("from HomeStayCustomer order by fname",
				HomeStayCustomer.class);
		List<HomeStayCustomer> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(HomeStayCustomer theCustomer) {
		Session currentSession = sessionFactory.getCurrentSession();
		// currentSession.save(theCustomer);
		currentSession.saveOrUpdate(theCustomer);

	}

	@Override
	public HomeStayCustomer getCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		HomeStayCustomer theCustomer = currentSession.get(HomeStayCustomer.class, theId);
		// currentSession.close();
		return theCustomer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query theQuery = currentSession.createQuery("delete from HomeStayCustomer where cust_stay_id=:customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();

	}

}
