package com.example.login.services;

import java.util.List;

import com.example.login.dtos.LoginDTO;
import com.example.login.dtos.UserDTO;
import com.example.login.models.User;
import com.example.login.response.LoginResponse;

public interface UserService {
    String addUser(UserDTO userDTO);
    LoginResponse loginUser(LoginDTO loginDTO);
    List<User> findAll();
    User findById(Long id);
    void deleteById(Long id);

}
