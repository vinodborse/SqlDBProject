package com.vinu.topic.daoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.vinu.topic.dao.IUserMasterDao;
import com.vinu.topic.models.UserMaster;


@Repository
public class UserMasterDao implements IUserMasterDao{
	
	@PersistenceContext
	  private EntityManager entityManager;
	
	 /* public UserMaster findByUsername(String username) {
	    Query queryUser = entityManager
	        .createNamedQuery("findUserMasterByUsername");
	    queryUser.setParameter("username", username);

	    UserMaster user = null;
	    try {
	      user = (UserMaster) queryUser.getSingleResult();
	    } catch (NoResultException nre) {
	      // Do Nothing
	    }
	    return user;
	  }*/
	
	@Override
	public UserMaster findByUsername(String username) {
		TypedQuery<UserMaster> q = entityManager.createQuery("SELECT u FROM UserMaster AS u WHERE u.username = :username",UserMaster.class);
		q.setParameter("username", username);
		UserMaster userMaster = q.getSingleResult();
		return userMaster;
	}

}
