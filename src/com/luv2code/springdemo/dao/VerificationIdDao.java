package com.luv2code.springdemo.dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.VerificationId;

@Repository
public class VerificationIdDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Map<Integer, String> getVerificationId() {
		Map<Integer, String> verIdList = new HashMap<Integer, String>();
		Session session = sessionFactory.getCurrentSession();
		Query<VerificationId> query = session.createQuery("from VerificationId", VerificationId.class);
		List<VerificationId> list = query.getResultList();
		Iterator<VerificationId> iterator = list.iterator();
		while (iterator.hasNext()) {
			VerificationId vid = iterator.next();
			//verIdList.put(vid.getId(), vid.getGovtId());
		}
		return verIdList;
	}

}
