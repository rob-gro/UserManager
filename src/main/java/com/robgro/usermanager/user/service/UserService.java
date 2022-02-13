package com.robgro.usermanager.user.service;

import com.robgro.usermanager.user.User;
import com.robgro.usermanager.user.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> listAll() {
        return userRepository.findAll();
    }
}
