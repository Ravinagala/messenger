package com.example.messenger.controllers;

import com.example.messenger.entities.WorkSpace;
import com.example.messenger.entities.repos.WorkSpaceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkSpaceController {
    @Autowired
    WorkSpaceRepo workSpaceRepo;

    @GetMapping("/getWorkSpaces")
    public List<WorkSpace> getWorkSpaces(){
        return workSpaceRepo.findAll();
    }
}
