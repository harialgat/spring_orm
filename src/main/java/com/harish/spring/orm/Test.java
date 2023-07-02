package com.harish.spring.orm;


import com.harish.spring.orm.config.Config;
import com.harish.spring.orm.dao.StudentDao;
import com.harish.spring.orm.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        Student s  =  new Student(19,"adad","Ddada");
        ApplicationContext  con  = new AnnotationConfigApplicationContext(Config.class);
        StudentDao studentDao = (StudentDao) con.getBean("studentDao");
        studentDao.insertData(s);
    }
}
