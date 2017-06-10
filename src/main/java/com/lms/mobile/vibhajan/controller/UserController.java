package com.lms.mobile.vibhajan.controller;

import com.lms.mobile.vibhajan.model.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.model.BaseSingleResponse;
import com.lms.mobile.vibhajan.model.UserRequest;
import com.lms.mobile.vibhajan.service.UserService;

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
    public BaseSingleResponse<User> save(@RequestBody UserRequest user) {
        User userResponse = userService.save(user);
        BaseSingleResponse<User> response = new BaseSingleResponse<User>(Boolean.FALSE, HttpStatus.OK.value());
        if(null != userResponse) {
            response.setResponse(userResponse);
            response.setSuccess(Boolean.TRUE);
        }
        return response;
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.GET)
    public BaseResponse authenticateLogIn(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        Boolean success = userService.checkForUserAuthentication(userName, password);
        BaseResponse baseResponse = new BaseResponse(Boolean.FALSE,HttpStatus.OK.value());
        if(success) {
            baseResponse.setSuccess(Boolean.TRUE);
        }
        return baseResponse;
    }
}
