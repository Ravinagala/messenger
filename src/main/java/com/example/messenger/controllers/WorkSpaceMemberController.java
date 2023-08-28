package com.example.messenger.controllers;

import com.example.messenger.entities.WorkSpaceMember;
import com.example.messenger.entities.repos.WorkSpaceMemberRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkSpaceMemberController {
    @Autowired
    WorkSpaceMemberRepo workSpaceMemberRepo;

    @GetMapping("/getWorkSpaceMembers")
    public List<WorkSpaceMember> getWorkSpaceMembers(){
        return workSpaceMemberRepo.findAll();
    }
}
