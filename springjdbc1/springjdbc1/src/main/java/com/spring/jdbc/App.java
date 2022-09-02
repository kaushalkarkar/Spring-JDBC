package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My program started...." );
        
        
        ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
    
        String query="insert into student(id,name,city) values(?,?,?)" ;
        
        int result = template.update(query,456,"Kushal","Rajkot");
        System.out.println("number of record inserted..." + result);
    }
}
