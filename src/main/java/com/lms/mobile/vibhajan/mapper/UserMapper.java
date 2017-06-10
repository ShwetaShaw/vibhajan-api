package com.lms.mobile.vibhajan.mapper;

import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.model.UserRequest;

/**
 * Created by shwetashaw on 10/06/17.
 */
public class UserMapper {

    public static User mapUserRequestToEntity(UserRequest userRequest) {
        User user = new User();
        user.setContactNumber(userRequest.getContactNumber());
        user.setUserName(userRequest.getUserName().toLowerCase());
        user.setEmail(userRequest.getEmail());
        user.setName(userRequest.getName());
        return user;
    }
}
