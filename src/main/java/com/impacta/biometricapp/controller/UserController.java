package com.impacta.biometricapp.controller;

import com.impacta.biometricapp.dto.UserDTO;
import com.impacta.biometricapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<UserDTO> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/user/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("/user")
    public ResponseEntity<String> createUser(@RequestBody UserDTO dto){
        return new ResponseEntity<>(userService.createUser(dto), HttpStatus.OK);
    }

}