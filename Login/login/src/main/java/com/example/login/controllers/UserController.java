package com.example.login.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.login.dtos.LoginDTO;
import com.example.login.dtos.UserDTO;
import com.example.login.models.User;
import com.example.login.response.LoginResponse;
import com.example.login.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path = "/save")
    public String saveUser(@RequestBody UserDTO userDTO)
    {
        String id = userService.addUser(userDTO);
        return id;
    }

    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginMesage = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginMesage);
    }
    // Listar todos los usuarios
    @GetMapping(path = "/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    // Eliminar usuario
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.ok("Userdeleted successfully");
    }
}