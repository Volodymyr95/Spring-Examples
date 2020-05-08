package com.lits.service;

import com.lits.model.User;
import com.lits.model.UserDto;
import com.lits.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDto getByUsername(String username) {
        return  modelMapper.map(userRepository.findByUsername(username).get(),UserDto.class);
    }

    @Override
    public Long create(UserDto userDto) {
        var user = modelMapper.map(userDto, User.class);
        user.setPassword(bCryptPasswordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user).getId();
    }
}
