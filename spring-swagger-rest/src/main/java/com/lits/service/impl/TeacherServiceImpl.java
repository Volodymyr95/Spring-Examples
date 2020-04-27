package com.lits.service.impl;

import com.lits.dto.TeacherDto;
import com.lits.entity.Teacher;
import com.lits.exceptions.TeacherNotFoundException;
import com.lits.repository.TeacherRepository;
import com.lits.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;
import static java.util.stream.Collectors.toList;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public Long create(TeacherDto teacherDto) {
        return teacherRepository.save(modelMapper.map(teacherDto, Teacher.class)).getId();
    }


    @Override
    public TeacherDto getById(Long id) {
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new TeacherNotFoundException(format("Teacher with id : %d doesn't exist", id)));

        return modelMapper.map(teacher, TeacherDto.class);
    }

    @Override
    public List<TeacherDto> getAll() {
        List<Teacher> teachers = (List<Teacher>) teacherRepository.findAll();
        return teachers.stream().map(t -> modelMapper.map(t, TeacherDto.class)).collect(toList());
    }
}
