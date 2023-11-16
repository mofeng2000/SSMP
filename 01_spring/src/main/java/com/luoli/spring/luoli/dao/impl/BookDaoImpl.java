package com.luoli.spring.luoli.dao.impl;

import com.luoli.dao.BookDao;

public class BookDaoImpl implements BookDao {
    private BookDao bookDao=new BookDaoImpl();
    public void save(){
        System.out.println("book dao save !!!!");
       //bookDao.save();
    }

}
