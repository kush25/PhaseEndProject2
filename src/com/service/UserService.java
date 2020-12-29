package com.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.UserDao;
import com.model.Users;
import com.utility.HibernateUtility;

public class UserService implements UserDao {

	@Override
	public boolean registration(Users usr) {

		boolean reg = false;

		String uName = usr.getUname();

		Session session = HibernateUtility.getSession();

		List<Users> data = session.createQuery("from Users").list();

		for (Users us : data) {

			if (us.getUname().equalsIgnoreCase(uName)) {
				return false;
			}
		}

		Transaction tx = session.beginTransaction();
		session.save(usr);
		tx.commit();

		reg = true;
		return reg;
	}

	@Override
	public boolean login(Users usr) {
		String uname = usr.getUname();
		String upassword = usr.getUpassword();

		Session session = HibernateUtility.getSession();

		List<Users> data = session.createQuery("from Users").list();

		for (Users us : data) {

			if (us.getUname().equalsIgnoreCase(uname) && us.getUpassword().equals(upassword)) {
				return true;
			}
		}

		return false;
	}

}
