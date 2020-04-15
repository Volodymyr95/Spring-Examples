package com.lits.service;

import com.lits.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;


@Component
public class TeacherService {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional
    public void create(Teacher teacher) {
        getCurrentSession().persist(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return getCurrentSession().createQuery("SELECT t FROM Teacher t").getResultList();
    }

    @Transactional
    public void delete(Long teacherId) {
        getCurrentSession().remove(getCurrentSession().find(Teacher.class, teacherId));
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
