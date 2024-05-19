package com.curd.services;

import java.util.List;

//import org.springframework.stereotype.Component;

import com.curd.entity.User;


public interface UserService {
        
    public List<User> getUser();

	public void save(User user);

	public User findById(Integer id);

	public User findbyUserName(String userName);

	public void delete(User user);
    
}