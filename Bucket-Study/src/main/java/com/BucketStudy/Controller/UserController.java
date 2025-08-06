package com.BucketStudy.Controller;

import com.BucketStudy.Model.User;
import com.BucketStudy.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/BucketStudy")
public class UserController {
    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public User RegisterUser(@RequestBody User user){
       return service.creatUser(user);
    }

    @GetMapping("/login")
    public Optional<User> FindByEmail(String Email){
        return service.getUserByEmail(Email);
    }

}
