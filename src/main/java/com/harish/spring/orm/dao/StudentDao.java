package com.harish.spring.orm.dao;


import com.harish.spring.orm.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

@Component("studentDao")
public class StudentDao {
    @Autowired
    private HibernateTemplate hibernateTemplate;

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    public void insertData(Student student){
        this.hibernateTemplate.save(student);
    }


}
