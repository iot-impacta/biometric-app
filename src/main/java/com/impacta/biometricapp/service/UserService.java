package com.impacta.biometricapp.service;

import com.impacta.biometricapp.dto.UserDTO;
import com.impacta.biometricapp.model.User;
import com.impacta.biometricapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public UserDTO getUserById(Integer id) {
        UserDTO dto = new UserDTO();
        try{
            Optional<User> optionalUser = userRepository.findById(id);

            if(optionalUser.isPresent()){
                User user = optionalUser.get();

                dto = new UserDTO(user.getId(),user.getName(),user.getAge(),user.getLogged());
            }

        } catch(Exception e){
            e.printStackTrace();
        }

       return dto;
    }

    public List<UserDTO> getUsers(){
        List<UserDTO> userDTOList = new ArrayList<>();

        List<User> users = userRepository.findAll();

        for(User u : users){
            UserDTO dto = new UserDTO(u.getId(),u.getName(),u.getAge(),u.getLogged());

            userDTOList.add(dto);
        }

        return  userDTOList;
    }

    public String createUser(UserDTO dto) {
        User user = dto.toOrder(dto);
        try{
            userRepository.save(user);
            return "User saved";
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Could not be save the user";
    }
}
