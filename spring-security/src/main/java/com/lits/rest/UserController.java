package com.lits.rest;

import com.lits.model.UserDto;
import com.lits.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String ping() {
        return "Hello";
    }

    @PostMapping("/sign-up")
    @ResponseStatus(HttpStatus.CREATED)
    public Long singUp(@RequestBody UserDto userDto) {
        return userService.create(userDto);
    }

}
