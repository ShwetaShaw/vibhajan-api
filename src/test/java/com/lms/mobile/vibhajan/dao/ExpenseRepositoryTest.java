package com.lms.mobile.vibhajan.dao;

import com.lms.mobile.vibhajan.entity.Expense;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by LRathod on 6/11/17.
 */
/*@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:test.properties")*/
@ContextConfiguration(locations = "classpath:test-application-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Ignore
public class ExpenseRepositoryTest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Autowired
  private ExpenseRepository expenseRepository;

  @Test
  public void test() {

  }
  @Ignore
  @Transactional
  @Rollback(true)
  public void testAddExpense()
  {
    Expense expense = new Expense();
    expense.setDescription("Test description");
    expenseRepository.save(expense);

    List<Expense> expenses = expenseRepository.findAll();
    Assert.assertEquals("Test description", expenses.get(0).getDescription());
  }

  @Ignore
  public void testInsert() {
    String URL = "http://localhost:8081/vibhajan-api/expense/save";
    // prepare
    Expense employee = new Expense();
    employee.setDescription("This is test desc");
    // execute
    ResponseEntity<Expense> responseEntity = restTemplate.postForEntity(URL,
        employee,
        Expense.class);

    // collect Response
    int status = responseEntity.getStatusCodeValue();
    Expense resultEmployee = responseEntity.getBody();
    Assert.assertNotNull("Id should not be null", resultEmployee.getId());
  }
}
