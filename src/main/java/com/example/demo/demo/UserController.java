package com.example.demo.demo;

import com.example.demo.services.UserService;

import java.util.List;

import com.example.demo.entities.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
@RestController
@RequestMapping("/mongotest")
@ComponentScan
public class UserController {
    
    @Autowired
    private UserService service;

    @RequestMapping(value = "/getallusers" , method = RequestMethod.GET)
    public List<User> getAllUser(){
        return service.findAll();
    }
    @RequestMapping(value = "/saveuser" , method = RequestMethod.POST)
    public void saveUser(@RequestBody User user){
        service.createUser(user);
    }
    @GetMapping(value = "/hello")
    public String test(){
        return "hello world";
    }

}