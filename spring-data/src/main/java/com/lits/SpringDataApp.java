package com.lits;

import com.lits.entity.Teacher;
import com.lits.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataApp implements CommandLineRunner {

    @Autowired
    private TeacherService teacherService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataApp.class);
    }


    @Override
    public void run(String... args) throws Exception {
        teacherService.create(new Teacher("Test","Test"));
    }
}
