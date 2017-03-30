package com.vinu.topic.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vinu.topic.dao.IUserMasterDao;
import com.vinu.topic.iservices.IUserMasterService;
import com.vinu.topic.models.UserMaster;




@Service
public class UserMasterService implements IUserMasterService{
	 @Autowired
	  private IUserMasterDao userMasterDao;

	@Transactional(readOnly = true)
	  public UserMaster findByUsername(String username) {
	    UserMaster users = userMasterDao.findByUsername(username);
	    return users;
	  }
}
