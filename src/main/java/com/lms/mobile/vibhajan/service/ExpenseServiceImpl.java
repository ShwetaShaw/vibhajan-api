package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.dao.ExpenseRepository;
import com.lms.mobile.vibhajan.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by LRathod on 6/11/17.
 */
@Service
public class ExpenseServiceImpl implements ExpenseService {

  @Autowired
  private ExpenseRepository expenseRepository;

  @Transactional
  public Expense save(Expense expense) {
    return expenseRepository.save(expense);
  }

  @Transactional
  public List<Expense> findAll() {
    return expenseRepository.findAll();
  }
}
