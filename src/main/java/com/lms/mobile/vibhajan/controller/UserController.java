package com.lms.mobile.vibhajan.controller;

import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.model.BaseResponse;
import com.lms.mobile.vibhajan.model.BaseSingleResponse;
import com.lms.mobile.vibhajan.model.UserRequest;
import com.lms.mobile.vibhajan.service.UserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
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

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse authenticateLogIn(@RequestBody JSONObject request) {
        BaseSingleResponse<User> baseResponse = new BaseSingleResponse(Boolean.FALSE,HttpStatus.OK.value());
        User user = null;
        String userName = String.valueOf(request.get("userName"));
        String password = String.valueOf(request.get("password"));
        if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)) {
            user = userService.checkForUserAuthentication(userName, password);
        }
        if(null != user) {
            baseResponse.setSuccess(Boolean.TRUE);
            baseResponse.setResponse(user);
        }
        return baseResponse;
    }

    @RequestMapping(value = "/single", method = RequestMethod.GET)
    public User getUser(@RequestParam(value = "username") String userName) {
        return userService.getUser(userName);
    }
}
