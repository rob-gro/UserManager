package com.robgro.userManager.user.service;

import com.robgro.userManager.user.User;
import com.robgro.userManager.user.UserRepository;
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

    public void save(User user) {
        userRepository.save(user);
    }
}
