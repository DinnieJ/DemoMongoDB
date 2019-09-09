package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{
    @Autowired
    private UserDAO userDAO;

    public User createUser(User u){
        return userDAO.save(u);
    }

    public List<User> findByName(String name){
        return userDAO.findByName(name);
    }

    public List<User> findByDepartment(String department){
        return userDAO.findByDepartment(department);
    }

    public List<User> findAll(){
        return userDAO.findAll();
    }
}