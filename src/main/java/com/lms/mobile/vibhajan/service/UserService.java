package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.model.UserRequest;

import java.util.List;

/**
 * Created by LRathod on 6/10/17.
 */
public interface UserService {

  User save(UserRequest user);

  List<User> getAll();

  Boolean checkForUserAuthentication(String userName, String password);
}
