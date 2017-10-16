package com.roryCarter.Services.impl;

import com.roryCarter.Domain.User;
import com.roryCarter.Repository.UserRepository;
import com.roryCarter.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    public User save(User entity)
    {
        return userRepository.save(entity);
    }


    public User findById(String s)
    {

        return userRepository.findOne(s);
    }


    public User update(User entity)
    {
        return userRepository.save(entity);
    }


    public void delete(User entity)
    {
        userRepository.delete(entity);
    }

}
