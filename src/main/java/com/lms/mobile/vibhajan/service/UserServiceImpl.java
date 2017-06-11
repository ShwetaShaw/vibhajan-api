package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.entity.UserCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.mobile.vibhajan.dao.ClientCredentialRepository;
import com.lms.mobile.vibhajan.dao.UserRepository;
import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.mapper.Mappers;
import com.lms.mobile.vibhajan.model.UserRequest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by LRathod on 6/10/17.
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private ClientCredentialRepository clientCredentialRepository;

  @Transactional
  public User save(UserRequest user) {
    User userEntity = null;
    if(null != user && null == userRepository.findByUserNameEmailContactNumber(user.getUserName(), user.getEmail(), user.getContactNumber())) {
      userEntity = userRepository.save(Mappers.mapUserRequestToEntity(user));
      UserCredential userCredential = new UserCredential(userEntity.getId(), user.getPassword().toLowerCase());
      clientCredentialRepository.save(userCredential);
    }
    return userEntity;
  }

  @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
  public List<User> getAll() {
    return userRepository.findAll();
  }

  @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
  public User checkForUserAuthentication(String userName, String password) {
    User user = null;
    if(!StringUtils.isEmpty(userName) && !StringUtils.isEmpty(password)) {
      user = userRepository.findByUserName(userName);
      if(null != user) {
        UserCredential userCredential = clientCredentialRepository.findByUserId(user.getId());
        if(password.equals(userCredential.getPassword()))
          return user;
      }
    }
    return null;
  }

  @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
  public User getUser(String userName) {
    User user = null;
    if(!StringUtils.isEmpty(userName)) {
      user = userRepository.findByUserName(userName);
    }
    return user;
  }
}
