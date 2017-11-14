package com.github.java4wro.user;

import com.github.java4wro.user.dto.UserDTO;

import java.util.List;


public interface UserService {

    UserDTO findUserbyEmail(String userEmail);
    UserDTO addUser(UserDTO userDTO);

    List<UserDTO> getAll();

    void confirmRegistration(String token);
}
