package com.atguigu.spring5.Test;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testspr5 {
   @Test//创建角色测试
   public void testAdd() {
      //加载配置文件
      ApplicationContext context =
              new ClassPathXmlApplicationContext("bean1.xml");
      //获取配置创建对象
      User user = context.getBean("user", User.class);

      //做输出
      System.out.println(user);
      user.add();
   }

   @Test//set注入属性测试
   public void testBook() {
      ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
      Book book = context.getBean("book", Book.class);

      System.out.println(book);
      book.testDemo();
   }
   @Test//set注入属性空值测试
   public void testBook3() {
      ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
      Book book = context.getBean("book3", Book.class);

      System.out.println(book);
      book.testDemo();
   }
   //标签注入属性测试
   @Test
   public void testBook2() {
      ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
      Book book = context.getBean("book2", Book.class);

      System.out.println(book);
      book.testDemo();
   }

   @Test//构造函数注入属性测试
   public void testOrders(){
      ApplicationContext context =
              new ClassPathXmlApplicationContext("bean1.xml");
      Orders order = context.getBean("order", Orders.class);

      System.out.println(order);
      order.ordersTest();
   }
}

