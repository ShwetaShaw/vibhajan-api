package com.lms.mobile.vibhajan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.mobile.vibhajan.dao.GroupRepository;
import com.lms.mobile.vibhajan.entity.Group;
import com.lms.mobile.vibhajan.mapper.Mappers;
import com.lms.mobile.vibhajan.model.GroupRequest;

/**
 * Created by shwetashaw on 11/06/17.
 */
@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    public Group createGroup(GroupRequest groupRequest) {
        Group group = Mappers.mapGroupRequestToEntity(groupRequest);
        return groupRepository.save(group);
    }
}
