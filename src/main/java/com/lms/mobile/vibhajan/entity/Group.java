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
 * Created by shwetashaw on 11/06/17.
 */
@Entity
@Table(name = Group.GROUP_TABLE)
public class Group implements Serializable {

    private static final long serialVersionUID = 8152966830839250739L;
    public static final String GROUP_TABLE = "groups";
    private static final String GROUP_ID_SEQ = "group_id_seq";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = GROUP_ID_SEQ)
    @SequenceGenerator(name = GROUP_ID_SEQ, sequenceName = GROUP_ID_SEQ, allocationSize = 1)
    private long id;

    private String name;

    private String type;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_date", nullable = false)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "update_date", nullable = false)
    private Date updateDate;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
