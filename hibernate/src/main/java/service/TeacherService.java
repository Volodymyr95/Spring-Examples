package service;

import config.HibernateUtil;
import com.lits.entity.Teacher;
import org.hibernate.Session;

import java.util.List;

public class TeacherService {

    public void add(Teacher teacher) {
        getCurrentSession().persist(teacher);
    }

    public void delete(Teacher teacher) {
        getCurrentSession().delete(teacher);
    }

    public List<Teacher> getAll() {
        return (List<Teacher>) getCurrentSession().createQuery("SELECT t FROM Teacher t",Teacher.class);
    }

    private Session getCurrentSession() {
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }
}
