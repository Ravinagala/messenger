package com.example.messenger.services;

import com.example.messenger.entities.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    User getById(int id);

    User addNewUser(User user);

    void deleteUserById(int id);
}
