package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.dao.UserRepository;
import com.lms.mobile.vibhajan.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LRathod on 6/10/17.
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  public User save(User user) {
    return userRepository.save(user);
  }

  public List<User> getAll() {
    return userRepository.findAll();
  }
}
