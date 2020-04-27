package com.lits.rest;

import com.lits.dto.TeacherDto;
import com.lits.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long createTeacher(@Validated @RequestBody TeacherDto teacherDto) {
        return teacherService.create(teacherDto);
    }

    @GetMapping("/teacher/{teacherId}")
    public TeacherDto getTeacherById(@PathVariable Long teacherId) {
        return teacherService.getById(teacherId);
    }

    @GetMapping
    public List<TeacherDto> getAll() {
        return teacherService.getAll();
    }

}

