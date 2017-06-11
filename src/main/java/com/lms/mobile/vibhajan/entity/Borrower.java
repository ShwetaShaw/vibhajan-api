package com.lms.mobile.vibhajan.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by LRathod on 6/11/17.
 */
@Entity
@Table(name = Borrower.EXPENSE_BORROWER_TABLE_NAME)
public class Borrower {

  public static final String EXPENSE_BORROWER_TABLE_NAME = "borrower";
  private static final String EXPENSE_BORROWER_ID_SEQUENCE_NAME = "borrower_id_seq";

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = EXPENSE_BORROWER_ID_SEQUENCE_NAME)
  @SequenceGenerator(name = EXPENSE_BORROWER_ID_SEQUENCE_NAME, sequenceName = EXPENSE_BORROWER_ID_SEQUENCE_NAME, allocationSize = 1)
  private long id;

  @ManyToMany(fetch = FetchType.EAGER)
  @JoinTable(name = "borrower_users", joinColumns = { @JoinColumn(name = "borrower_id")}, inverseJoinColumns = { @JoinColumn(name = "users_id") })
  private List<User> users;

/*  @ManyToOne
  @JoinColumn(name="expense_id", nullable=false)
  private Expense expense;*/

  private BigDecimal amount;

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

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  public long getId() {
    return id;
  }

 /* public Expense getExpense() {
    return expense;
  }

  public void setExpense(Expense expense) {
    this.expense = expense;
  }*/

  public void setId(long id) {
    this.id = id;
  }

  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public List<User> getUsers() {
    return users;
  }

  public void setUsers(List<User> users) {
    this.users = users;
  }
}
