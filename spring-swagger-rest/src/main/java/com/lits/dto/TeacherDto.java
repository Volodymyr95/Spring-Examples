package com.lits.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class TeacherDto {

    private Long id;

    @NotBlank
    private String firstName;

    private String lastName;

    @Email(message = "Incorrect email DUDE!!!")
    private String email;


}
