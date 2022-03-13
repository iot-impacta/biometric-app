package com.impacta.biometricapp.dto;

import com.impacta.biometricapp.model.User;
import com.sun.org.apache.xpath.internal.operations.Bool;

public class UserDTO {
    private Integer id;
    private String name;
    private Integer age;
    private Boolean isLogged;

    public UserDTO(){

    }
    public UserDTO(String name, Integer age, Boolean isLogged) {
        this.name = name;
        this.age = age;
        this.isLogged = isLogged;
    }

    public UserDTO(Integer id, String name, Integer age, Boolean isLogged) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isLogged = isLogged;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsLogged() {
        return isLogged;
    }

    public void setIsLogged(Boolean isLogged) {
        this.isLogged = isLogged;
    }

    public User toOrder(UserDTO dto){
        User u = new User();
        if(dto.getId() != null){
             u.setId(dto.getId());
        }

        if (dto.getName() != null){
            u.setName(dto.getName());
        }

        if(dto.getAge() != null){
            u.setAge(dto.getAge());
        }

        if(dto.getIsLogged() != null){
            u.setLogged(dto.getIsLogged());
        }

        return u;
    }

}
