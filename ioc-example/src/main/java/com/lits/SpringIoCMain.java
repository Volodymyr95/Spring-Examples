package com.lits;

import com.lits.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringIoCMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//        Customer customer = (Customer) context.getBean("customer");
//        System.out.println(customer.getCompany().getCompanyName());


    }
}
