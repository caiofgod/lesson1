package com.atguigu.spring5.Test;

import com.atguigu.spring5.Service.UserService;
import com.atguigu.spring5.bean.Emp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {
    @Test
    public void tesAddbean2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");

        UserService userService = context.getBean("userService",UserService.class);
        userService.add();
    }
    @Test
    public void tesAddbean3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean3.xml");

        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
    @Test
    public void tesAddbean4(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean4.xml");

        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
