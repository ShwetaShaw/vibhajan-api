package com.lms.mobile.vibhajan.controller;

import com.lms.mobile.vibhajan.entity.Expense;
import com.lms.mobile.vibhajan.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by LRathod on 6/11/17.
 */
@RestController
@RequestMapping(value = "expense", produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
public class ExpenseController {

  @Autowired
  private ExpenseService expenseService;

  @RequestMapping(value = "/save", method = RequestMethod.POST)
  public Expense save(@RequestBody Expense expense) {
    return expenseService.save(expense);
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  public List<Expense> findAll() {
    return expenseService.findAll();
  }
}
