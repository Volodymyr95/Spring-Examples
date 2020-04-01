package com.lits.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Autowired
    private Company company;


    public Company getCompany() {
        return company;
    }
}
