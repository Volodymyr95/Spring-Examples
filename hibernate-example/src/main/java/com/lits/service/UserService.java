package com.lits.service;

import com.lits.models.User;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Component
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);
    }

    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT u FROM User u").getResultList();
    }

    @Transactional
    public void removeUser(Long userId) {
        entityManager.remove(entityManager.find(User.class, userId));
    }

}
