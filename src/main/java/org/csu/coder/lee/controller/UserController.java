package org.csu.coder.lee.controller;

import org.csu.coder.lee.domain.User;
import org.csu.coder.lee.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by csucoderlee on 2017 04 05 下午10:26.
 */
@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepository.findAll();
    }
}
