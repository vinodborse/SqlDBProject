package com.vinu.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinu.topic.iservices.IUserMasterService;
import com.vinu.topic.models.UserMaster;


@RestController
@RequestMapping("/topic")
public class TopicController {

	@Autowired
	  private IUserMasterService userMasterService;

	
	@RequestMapping(value = "/userMaster", method = RequestMethod.GET)
	  public @ResponseBody UserMaster userMasterHandler(
	      @RequestParam String username) {
	    UserMaster userMaster = userMasterService.findByUsername(username);
	   // logger.info("Sending UserMaster json for username: {} ", username);
	    return userMaster;
	  }
}
