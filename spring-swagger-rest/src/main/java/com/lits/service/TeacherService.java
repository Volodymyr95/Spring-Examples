package com.lits.service;

import com.lits.dto.TeacherDto;

import java.util.List;

public interface TeacherService {

    Long create(TeacherDto teacherDto);

    TeacherDto getById(Long id);

    List<TeacherDto> getAll();

}
