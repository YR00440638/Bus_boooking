package com.Bus.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Bus.pojo.UserProfile;
@Repository
public interface UserInformation extends MongoRepository<UserProfile,String> {
	
	public UserProfile findByusername(String userName);

	

}
