package com.project.survey.controller;


import com.project.survey.model.User;
import com.project.survey.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/v1/users")
public class UserController {


    private final UserService userService;

    public UserController(UserService userService) {
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

//    @GetMapping("createUser/{userData}")
//    public String createUser(@PathVariable String userData){
//
//        return "Kullanıcı oluşturuldu " + userData;
//    }

    @PostMapping("createUser")
    public ResponseEntity<User> createUser(@RequestBody User user){

        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);

    }
}
