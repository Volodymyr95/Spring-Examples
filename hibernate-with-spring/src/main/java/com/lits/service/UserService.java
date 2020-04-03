package com.lits.service;

import com.lits.models.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;


@Component
public class UserService {

    @Autowired
    private SessionFactory sessionFactory;


    public void addUser(User user) {
        getCurrentSession().persist(user);
    }

    public List<User> getAllUsers() {
        return getCurrentSession().createQuery("SELECT u FROM User u").getResultList();
    }

    @Transactional
    public void removeUser(Long userId) {
        getCurrentSession().remove(getCurrentSession().find(User.class, userId));
    }

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

}
