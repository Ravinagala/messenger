package com.example.messenger.controllers;

import com.example.messenger.entities.Thread;
import com.example.messenger.entities.ThreadMessage;
import com.example.messenger.entities.repos.ThreadMessageRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ThreadMessageController {
    @Autowired
    ThreadMessageRepo threadMessageRepo;

    @GetMapping("/getThreadMessages")
    public List<ThreadMessage> getThreadMessages(){
        return threadMessageRepo.findAll();
    }


    @GetMapping("/getByThreadMessageId")
    public ThreadMessage getById(@RequestParam("id") int id){
        var v = threadMessageRepo.findById(id);
        if(v.isPresent()){
            return v.get();
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid data");
    }

   @PostMapping("/addNewMessage")
    public ThreadMessage addNewMessage(@RequestBody ThreadMessage threadMessage){
        threadMessageRepo.save(threadMessage);
        return threadMessage;
   }

   @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam("id") int id){
        var v = threadMessageRepo.findById(id);
        if(v.isPresent()){
            threadMessageRepo.deleteById(id);
        }else
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Invalid Data");
   }

   @PutMapping("/updateContent")
    public ThreadMessage setById(@RequestParam("id") int id, @RequestParam("content") String content){
        var tm = threadMessageRepo.findById(id);
        if(tm.isPresent()){
            var t = tm.get();
            t.setContent(content);
            threadMessageRepo.save(t);
            return t;
        }else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Data Not Found");
   }


}
