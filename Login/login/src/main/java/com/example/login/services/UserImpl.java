package com.example.login.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.login.dtos.LoginDTO;
import com.example.login.dtos.UserDTO;
import com.example.login.models.User;
import com.example.login.repositorios.UserRepository;
import com.example.login.response.LoginResponse;

@Service
public class UserImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public String addUser(UserDTO userDTO){
        User user = new User(
            userDTO.getNombreCompleto(), 
            userDTO.getTelefono(),
            userDTO.getCorreoElectronico(),
            userDTO.getUsername(),
            this.passwordEncoder.encode(userDTO.getPassword())
            
        );

        userRepository.save(user);

        return user.getNombreCompleto();
    }
    //UserDTO userDTO;

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO){
        String msg = "";
        User user = userRepository.findByUsername(loginDTO.getUsername()).orElse(null);
        if (user != null) {
            if (passwordEncoder.matches(loginDTO.getPassword(), user.getPassword())) {
                return new LoginResponse("Login Success", true);
            } else {
                return new LoginResponse("Password Not Match", false);
            }
        }else {
            return new LoginResponse("Username not exits", false);
        }


    }

    //Listar
    public List<User> findAll(){
        return userRepository.findAll();
    }

    //mostrar por id
    public User findById(Long id){
        return userRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id){
        userRepository.deleteById(id);
    }

}
