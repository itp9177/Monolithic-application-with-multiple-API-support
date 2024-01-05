package com.itp.youtube.Rest.controller;

import com.itp.youtube.Entity.MyUser;
import com.itp.youtube.dto.UserDto;
import com.itp.youtube.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController()
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @PostMapping
    public Optional<MyUser> createUser(@RequestBody UserDto userDto){
        MyUser newUser = new MyUser();
        newUser.setUserName(userDto.name());
     System.out.println(newUser.getId());
     return Optional.ofNullable(userService.saveUser(newUser));

    }
    @GetMapping
    public Optional<MyUser> createUser2(){
        System.out.println("hellodd");

        MyUser newUser = new MyUser();
        newUser.setUserName("hello");
        System.out.println(newUser.getId());

        return Optional.ofNullable(userService.saveUser(newUser));

    }
}
