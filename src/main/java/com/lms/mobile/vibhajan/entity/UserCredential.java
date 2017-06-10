package com.lms.mobile.vibhajan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by shwetashaw on 10/06/17.
 */

@Entity
@Table(name = UserCredential.PASSWORD_TABLE)
public class UserCredential implements Serializable {

    private static final long serialVersionUID = 8152966830839250737L;

    public static final String PASSWORD_TABLE = "user_credential";

    private static final String PASSWORD_ID_SEQ = "password_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = PASSWORD_ID_SEQ)
    @SequenceGenerator(name = PASSWORD_ID_SEQ, sequenceName = PASSWORD_ID_SEQ, allocationSize = 1)
    private long id;

    private long userId;
    private String password;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", nullable = false)
    private Date updateDate;

    public UserCredential(long userId, String password) {
        this.userId=userId;
        this.password=password;
    }

    public UserCredential() {
    }

    @PrePersist
    protected void onCreate() {
        updateDate = createDate = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        updateDate = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
