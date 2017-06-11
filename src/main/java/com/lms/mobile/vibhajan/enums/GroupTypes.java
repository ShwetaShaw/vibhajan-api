package com.lms.mobile.vibhajan.enums;

/**
 * Created by shwetashaw on 11/06/17.
 */
public enum GroupTypes {

    TRIPS(1,"Trips"),
    PARTY(2,"Party"),
    APARTMENT(3,"Apartment"),
    OTHERS(4,"Others")
    ;
    private Integer index;
    private String type;

    GroupTypes(Integer index, String type) {
        this.index = index;
        this.type = type;
    }

    public Integer getIndex() {
        return index;
    }

    public String getType() {
        return type;
    }
}
