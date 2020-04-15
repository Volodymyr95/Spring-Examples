package com.lits.service;

import com.lits.entity.Teacher;

import java.util.List;

public interface TeacherService {

    void create(Teacher teacher);

    void delete(Long id);

    void update(Teacher teacher);

    List<Teacher> getAll();
}
