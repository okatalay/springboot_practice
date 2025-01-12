package com.project.survey.service;



import com.project.survey.model.User;
import com.project.survey.repository.UserRepository;
import org.springframework.stereotype.Service;


@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


//    public User createUser(User user) {
//
//
//    }
}
