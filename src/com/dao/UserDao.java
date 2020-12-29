package com.dao;

import com.model.Users;

public interface UserDao {

		public boolean registration(Users usr);
		public boolean login(Users usr);
}
