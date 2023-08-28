package com.example.messenger.controllers;

import com.example.messenger.entities.UserRelationShip;
import com.example.messenger.entities.repos.UserRelationShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserRelationShipController {

    @Autowired
    UserRelationShipRepo userRelationShipRepo;

    @GetMapping("/getUserRelationShips")
    public List<UserRelationShip> getUserRelationShips(){
        return userRelationShipRepo.findAll();
    }
}
