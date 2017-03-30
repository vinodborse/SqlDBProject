package com.vinu.topic.dao;

import com.vinu.topic.models.UserMaster;

public interface IUserMasterDao {
	UserMaster findByUsername(String username);
}
