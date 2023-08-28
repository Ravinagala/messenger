package com.example.messenger.controllers;


import com.example.messenger.entities.Thread;
import com.example.messenger.entities.repos.ThreadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ThreadController {

    @Autowired
    ThreadRepo threadRepo;

    @GetMapping("/getThreads")
    public List<Thread> getThreads(){
        return threadRepo.findAll();
    }

}
