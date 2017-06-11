package com.lms.mobile.vibhajan.mapper;

import com.lms.mobile.vibhajan.entity.Group;
import com.lms.mobile.vibhajan.entity.User;
import com.lms.mobile.vibhajan.model.GroupRequest;
import com.lms.mobile.vibhajan.model.UserRequest;

/**
 * Created by shwetashaw on 10/06/17.
 */
public class Mappers {

    public static User mapUserRequestToEntity(UserRequest userRequest) {
        User user = new User();
        user.setContactNumber(userRequest.getContactNumber());
        user.setUserName(userRequest.getUserName().toLowerCase());
        user.setEmail(userRequest.getEmail());
        user.setName(userRequest.getName());
        return user;
    }

    public static Group mapGroupRequestToEntity(GroupRequest groupRequest) {
        Group group = new Group();
        group.setName(groupRequest.getName());
        group.setType(groupRequest.getType());
        return group;
    }
}
