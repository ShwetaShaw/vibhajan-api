package com.lms.mobile.vibhajan.controller;

import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shwetashaw on 10/06/17.
 */

@RestController
@RequestMapping(value = "users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String isAlive() {
        return "Server is alive! Go Away";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
