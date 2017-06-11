package com.lms.mobile.vibhajan.model;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by shwetashaw on 11/06/17.
 */
public class GroupRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String type;

    public GroupRequest(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public GroupRequest() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
