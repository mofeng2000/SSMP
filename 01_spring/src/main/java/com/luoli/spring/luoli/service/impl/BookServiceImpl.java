package com.luoli.spring.luoli.service.impl;

import com.luoli.dao.BookDao;
import com.luoli.dao.impl.BookDaoImpl;
import com.luoli.service.BookService;

public class BookServiceImpl implements BookService {
    private BookDao bookDao=new BookDaoImpl();
    public void save(){
        System.out.println("book service save!!!");
        bookDao.save();
    }


}
