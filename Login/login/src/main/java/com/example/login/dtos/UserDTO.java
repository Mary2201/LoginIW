package com.example.login.dtos;

import lombok.Data;

@Data
public class UserDTO {
    private Long id;
    private String nombreCompleto;
    private String telefono;
    private String correoElectronico;
    private String username;
    private String password;
}
