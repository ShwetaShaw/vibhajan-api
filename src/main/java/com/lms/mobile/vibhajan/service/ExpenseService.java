package com.lms.mobile.vibhajan.service;

import com.lms.mobile.vibhajan.entity.Expense;

import java.util.List;

/**
 * Created by LRathod on 6/11/17.
 */
public interface ExpenseService {

  Expense save(Expense expense);

  List<Expense> findAll();
}
