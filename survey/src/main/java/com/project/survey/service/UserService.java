package com.project.survey.service;



import com.project.survey.model.User;
import com.project.survey.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<?> createUser(User createUser) {

        User userChecked = userRepository.findByUsername(createUser.getUsername());

        if (userChecked == null) {
            userRepository.save(createUser);
            return new ResponseEntity<>("User created !", HttpStatus.CREATED);
        }
        throw new RuntimeException("User already exists !");
    }


    public ResponseEntity<?> showUsers() {

        List<User> userList = userRepository.findAll();

        System.out.println(userList);

        return new ResponseEntity<>(userList, HttpStatus.OK);


    }
}
