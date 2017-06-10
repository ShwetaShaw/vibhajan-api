package com.lms.mobile.vibhajan.model;

import org.hibernate.validator.constraints.NotBlank;

import java.io.Serializable;

/**
 * Created by shwetashaw on 10/06/17.
 */

public class UserRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank
    private String userName;
    @NotBlank
    private String name;
    @NotBlank
    private String email;
    @NotBlank
    private String contactNumber;
    @NotBlank
    private String password;

    public UserRequest() {
    }

    private UserRequest(Builder builder) {
        setUserName(builder.userName);
        setName(builder.name);
        setEmail(builder.email);
        setContactNumber(builder.contactNumber);
        setPassword(builder.password);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String userName;
        private String name;
        private String email;
        private String contactNumber;
        private String password;

        private Builder() {
        }

        public Builder withUserName(String val) {
            userName = val;
            return this;
        }

        public Builder withName(String val) {
            name = val;
            return this;
        }

        public Builder withEmail(String val) {
            email = val;
            return this;
        }

        public Builder withContactNumber(String val) {
            contactNumber = val;
            return this;
        }

        public Builder withPassword(String val) {
            password = val;
            return this;
        }

        public UserRequest build() {
            return new UserRequest(this);
        }
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
