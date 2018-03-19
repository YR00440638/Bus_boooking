package com.Bus.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Bus.Repository.UserInformation;
import com.Bus.pojo.UserProfile;

@RestController
@org.springframework.web.bind.annotation.RequestMapping("/bus")
public class Controller {
	
	@Autowired
	private UserInformation userInformation;
	
	@GetMapping
	@RequestMapping(value= "/user")
	public UserProfile getuserprofile(@RequestParam String User) {
		
		return userInformation.findByusername(User);
	}

}
