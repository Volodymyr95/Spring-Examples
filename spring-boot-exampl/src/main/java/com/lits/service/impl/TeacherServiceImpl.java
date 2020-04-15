package com.lits.service.impl;

import com.lits.entity.Teacher;
import com.lits.repository.TeacherRepository;
import com.lits.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public void create(Teacher teacher) {
        teacherRepository.createTeacher(teacher);
    }

    @Override
    public void delete(Long id) {
        teacherRepository.deleteTeacher(id);
    }

    @Override
    public void update(Teacher teacher) {
        teacherRepository.updateTeacher(teacher);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAllTeachers();
    }
}
