package com.project.survey.controller;


import com.project.survey.model.User;
import com.project.survey.service.impl.UserServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/users")
public class UserController {


    private final UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("sayGoodNight")
    public String sayGoodNight() {

        return "Good Night";
    }

    @GetMapping("sayMyName/{name}")
    public String sayMyName(@PathVariable String name){

        return "My Name is "+name;
    }

    @GetMapping("createUser/{userData}")
    public String createUser(@PathVariable String userData){

        return "Kullanıcı oluşturuldu " + userData;
    }

    @PostMapping("createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){

        return new ResponseEntity<>(userService.save(user.getId(),user), HttpStatus.CREATED);

    }
}
