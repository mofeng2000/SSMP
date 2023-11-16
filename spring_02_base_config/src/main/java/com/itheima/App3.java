package com.itheima;


import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App3 {
    public static void main(String[] args) {
        //3.获取IoC控制器
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
//        BookDao bookDao = (BookDao) context.getBean("bookDao");
//        bookDao.save();
        BookService bookService = (BookService) context.getBean("service");
        BookService bookService2 = (BookService) context.getBean("service");
        bookService.save();
        System.out.println(bookService);
        System.out.println(bookService2);//是否为统一对象

    }
}
