package com.lits.repository;

import com.lits.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TeacherRepository extends CrudRepository<Teacher, Long> {

    Optional<Teacher> findByFirstName(String firstName);
}
