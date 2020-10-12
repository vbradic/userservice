package com.vuksoftware.service;

import com.vuksoftware.exception.DataNotFoundException;
import com.vuksoftware.model.User;
import com.vuksoftware.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserProcessor {

    public UserProcessor() {}

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    public UserProcessor(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }

    public String AppLabel() {
        return "MF USERSERVICE";
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String userId) {
        try {
            User user = this.userRepository.findById(userId).get();
            return user;
        } catch(Exception e) {
            throw new DataNotFoundException("No user with id:" + userId);
        }


    }

    public User addUser(User user) {
        return this.userRepository.save(user);
    }
}
