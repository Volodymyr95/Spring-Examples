package com.lits.repository;

import com.lits.entity.Teacher;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class TeacherRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void createTeacher(Teacher teacher) {
        sessionFactory.getCurrentSession().persist(teacher);
    }

    public void updateTeacher(Teacher teacher) {
        sessionFactory.getCurrentSession().merge(teacher);
    }

    public void deleteTeacher(Long id) {
        var session = sessionFactory.getCurrentSession();
        session.delete(session.get(Teacher.class, id));
    }

    public List<Teacher> findAllTeachers() {
        return sessionFactory.getCurrentSession().createQuery("FROM Teacher", Teacher.class).list();
    }

}
