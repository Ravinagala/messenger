package com.example.messenger.controllers;

import com.example.messenger.entities.User;
import com.example.messenger.entities.repos.UserRepo;
import com.example.messenger.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getById")
    public User getById(@RequestParam("id") int id){
        return userService.getById(id);
    }

    @PostMapping("/addNewUser")
    public User addNewUser(@RequestBody User user) {
          return userService.addNewUser(user);

    }

    @DeleteMapping("/deleteUser")
    public void deleteUserId(@RequestParam("id") int id){
       userService.deleteUserById(id);
    }
}
