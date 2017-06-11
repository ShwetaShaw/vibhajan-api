package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.entity.Group;
import com.lms.mobile.vibhajan.model.GroupRequest;

/**
 * Created by shwetashaw on 11/06/17.
 */
public interface GroupService {

    Group createGroup(GroupRequest groupRequest);
}
