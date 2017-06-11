package com.lms.mobile.vibhajan.dao;

import com.lms.mobile.vibhajan.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by LRathod on 6/11/17.
 */
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
