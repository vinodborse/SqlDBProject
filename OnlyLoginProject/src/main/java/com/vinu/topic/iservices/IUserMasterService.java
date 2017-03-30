package com.vinu.topic.iservices;

import com.vinu.topic.models.UserMaster;

public interface IUserMasterService {
	UserMaster findByUsername(String username);
}
