package com.lits;

import com.lits.config.JavaConfig;
import com.lits.models.User;
import com.lits.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(JavaConfig.class);

        var userService = context.getBean(UserService.class);
        userService.addUser(new User("user"));
    }

}
