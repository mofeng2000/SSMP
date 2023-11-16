package org.example;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource= (DataSource) context.getBean("dataSource");
        System.out.println(dataSource);
    }
}
