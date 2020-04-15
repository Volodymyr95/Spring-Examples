package com.lits;

import com.lits.config.JavaConfig;
import com.lits.entity.Teacher;
import com.lits.service.TeacherService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHibernateMain {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(JavaConfig.class);

        var teacherService = context.getBean(TeacherService.class);
        teacherService.create(new Teacher("John","Doe"));
    }

}
