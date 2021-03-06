package com.ek.spring.demo13_transaction_annotation;


import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ek.spring.demo13_transaction_annotation.service.IBookShopService;
import com.ek.spring.demo13_transaction_annotation.service.ICashierService;

/**
 * 测试Spring Transaction 
 *
 */
public class SpringTransactionTest {

  private AbstractApplicationContext ctx = null;
  private IBookShopService bookShopService;
  private ICashierService cashierService;
  
  {
    ctx = new ClassPathXmlApplicationContext("applicationContext_demo13.xml");
    bookShopService = ctx.getBean(IBookShopService.class);
    cashierService = ctx.getBean(ICashierService.class);
  }
  
  
  /*测试事务(annotation实现的)*/
  @Test
  public void testBookShop(){
    bookShopService.purchase("ek", "1001");
  }
  
 
  
  /*测试事务的传播行为*/
  @Test
  public void testTransactionPropagation(){
    List<String> isbns = new ArrayList<String>();
    isbns.add("1001");
    isbns.add("1002");
    cashierService.checkout("ek", isbns);
  }
  
  @After
  public void closeContext(){
    ctx.close();
  }

}