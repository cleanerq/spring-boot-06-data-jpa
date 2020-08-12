package com.qby.springboot.controller;

import com.qby.springboot.entity.User;
import com.qby.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        User one = null;
        try {
            boolean flg = userRepository.existsById(id);
            if (flg) {
                one = userRepository.getOne(id);
            }
            System.out.println(one);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return one;
    }

    @GetMapping("/user")
    public User insertUser(User user) {
        User save = null;
        try {
            save = userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return save;
    }

}
