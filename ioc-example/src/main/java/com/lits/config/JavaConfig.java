package com.lits.config;

import com.lits.model.User;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

import java.util.Random;

@Configuration
@ComponentScan(value = "com")
@PropertySource("application.properties")
public class JavaConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public User user() {
        return new User(new Random().nextInt(30),"John");
    }
}
