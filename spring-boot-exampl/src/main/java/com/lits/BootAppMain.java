package com.lits;

import com.lits.entity.Teacher;
import com.lits.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootAppMain implements CommandLineRunner {

    @Autowired
    private TeacherService teacherService;

    public static void main(String[] args) {
        SpringApplication.run(BootAppMain.class);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started ----");

        teacherService.create(new Teacher("John", "doe"));
        teacherService.create(new Teacher("John", "doe"));

        System.out.println(teacherService.getAll());

        System.out.println("End -----");
    }
}
