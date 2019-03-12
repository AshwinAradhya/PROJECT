package com.myproj.home.dao;

import java.util.List;

import com.myproj.home.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
