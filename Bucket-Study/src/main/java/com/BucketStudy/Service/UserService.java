package com.BucketStudy.Service;

import com.BucketStudy.Model.User;
import com.BucketStudy.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    @Autowired
    public UserService(UserRepo userRepo, PasswordEncoder passwordEncoder) {
        this.userRepo = userRepo;
        this.passwordEncoder = passwordEncoder;
    }

    //Create User
    public User creatUser(User user){
        String password = user.getPassword();
        user.setPassword(passwordEncoder.encode(password));
        return userRepo.save(user);
    }

    //get all user by admin
    public List<User> getAllUser(){
        return userRepo.findAll();
    }

    //Get data User from db //validate
    public Optional<User> getUserByEmail(String Email){
        return userRepo.findByEmail(Email);
    }

    //Update user by thier email
    public User updateEmail(User user){
      return user;

    }


}