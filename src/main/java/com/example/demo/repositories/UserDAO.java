package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends MongoRepository<User,String>{
    List<User> findByName(String name);
    List<User> findByDepartment(String department);
}