package com.example.messenger.controllers;

import com.example.messenger.entities.User;
import com.example.messenger.entities.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo userRepo;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userRepo.findAll();
    }

    @GetMapping("/getById")
    public User getById(@RequestParam("id") int id){
        var v = userRepo.findById(id);
        if (v.isPresent()){
            return v.get();
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid Data");
    }

    @PostMapping("/addNewUser")
    public User addNewUser(@RequestBody User user) {
//        var id = userRepo.findById(user.getId());
//        if (id.isPresent()) {
//            throw new ResponseStatusException(HttpStatus.ALREADY_REPORTED, "The id is already present");
//        } else{
            userRepo.save(user);
            return user;

    }

    @DeleteMapping("/deleteUser")
    public void deleteUserId(@RequestParam("id") int id){
        var v = userRepo.findById(id);
        if(v.isPresent()){
            userRepo.deleteById(id);
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid data");
    }
}
