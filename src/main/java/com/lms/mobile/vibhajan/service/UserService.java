package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.entity.User;

import java.util.List;

/**
 * Created by LRathod on 6/10/17.
 */
public interface UserService {

  User save(User user);

  List<User> getAll();
}
