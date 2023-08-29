package com.example.messenger.services;

import com.example.messenger.entities.User;
import com.example.messenger.entities.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepo userRepo;
    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getById(int id) {
        var v = userRepo.findById(id);
        if(v.isPresent()){
            return v.get();
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid Data");
    }

    @Override
    public User addNewUser(User user) {
        userRepo.save(user);
        return user;
    }

    @Override
    public void deleteUserById(int id) {
        var v = userRepo.findById(id);
        if(v.isPresent()){
            userRepo.deleteById(id);
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid data");

    }
}
