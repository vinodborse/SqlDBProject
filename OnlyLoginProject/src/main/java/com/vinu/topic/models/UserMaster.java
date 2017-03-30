/*
 * Copyright (c) 2016 Nextremer Solutions India Pvt Ltd
 * All Rights Reserved
 *
 * This software contains the intellectual property of Nextremer Solutions India Pvt Ltd
 * or is licensed to  Nextremer Solutions India Pvt Ltd from third parties. Use of this
 * software and the intellectual property contained therein is expressly limited
 * to the terms and conditions of the License Agreement under which it is
 * provided by or on behalf of Nextremer Solutions India Pvt Ltd
 */
package com.vinu.topic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;
@NamedQueries({
	  @NamedQuery(
	  name = "findUserMasterByUsername",
	  query = "FROM UserMaster u WHERE u.username = :username"
	  )
	})
/**
 * UserMaster pojo 
 * @version 1.0 26-Sep-2016
 */
@Entity
@Table(name = "user_master")
public class UserMaster{

  @Id
  @Column(name = "user_id")
  private Integer userId;

  @Column(name = "username")
  private String username;

  @Column(name = "password")
  private String password;

    
  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }

  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }

}

