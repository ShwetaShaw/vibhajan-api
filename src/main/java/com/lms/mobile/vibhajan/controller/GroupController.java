package com.lms.mobile.vibhajan.controller;

import com.lms.mobile.vibhajan.entity.Group;
import com.lms.mobile.vibhajan.model.GroupRequest;
import com.lms.mobile.vibhajan.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shwetashaw on 11/06/17.
 */
@RestController
@RequestMapping(value = "groups")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public Group save(@RequestBody GroupRequest groupRequest) {
        return groupService.createGroup(groupRequest);
    }
}
