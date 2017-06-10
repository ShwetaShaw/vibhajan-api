package com.lms.mobile.vibhajan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shwetashaw on 10/06/17.
 */
@RestController
public class UserController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String isAlive() {
        return "Server is alive! Go Away";
    }
}
