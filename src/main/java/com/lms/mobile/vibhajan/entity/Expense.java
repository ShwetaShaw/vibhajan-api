package com.lms.mobile.vibhajan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by LRathod on 6/11/17.
 */
@Entity(name = Expense.EXPENSE_TABLE_NAME)
@Table(name = Expense.EXPENSE_TABLE_NAME)
public class Expense implements Serializable {

  public static final String EXPENSE_TABLE_NAME = "expense";
  private static final String EXPENSE_ID_SEQUENCE_NAME = "expense_id_seq";

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = EXPENSE_ID_SEQUENCE_NAME)
  @SequenceGenerator(name = EXPENSE_ID_SEQUENCE_NAME, sequenceName = EXPENSE_ID_SEQUENCE_NAME, allocationSize = 1)
  private long id;

  private String description;

  private String createdBy;

  @OneToOne(fetch = FetchType.EAGER)
  private Group group;

  @OneToMany
  @JoinColumn(name = "expense_id", referencedColumnName = "id")
  //@JoinTable(name = Borrower.EXPENSE_BORROWER_TABLE_NAME, joinColumns = { @JoinColumn(name = "expense_id")}, inverseJoinColumns = { @JoinColumn(name = "PHONE_ID") })
  private Set<Borrower> borrower;

  @OneToMany
  @JoinColumn(name = "expense_id", referencedColumnName = "id")
  private Set<Lender> lender;

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

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Set<Borrower> getBorrower() {
    return borrower;
  }

  public void setBorrower(Set<Borrower> borrower) {
    this.borrower = borrower;
  }

  public Set<Lender> getLender() {
    return lender;
  }

  public void setLender(Set<Lender> lender) {
    this.lender = lender;
  }
}
