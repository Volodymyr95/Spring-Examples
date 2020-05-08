package com.lits.service;

import com.lits.model.UserDto;

public interface UserService {

    UserDto getByUsername(String username);

    Long create(UserDto userDto);
}
