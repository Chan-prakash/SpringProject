package com.chan.SpringRESTJOB.Controller;

import com.chan.SpringRESTJOB.Model.User;
import com.chan.SpringRESTJOB.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user){
         return service.register(user);
    }


    @GetMapping("/getUser")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }








}
