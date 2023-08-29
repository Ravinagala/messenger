package com.example.messenger.controllers;

import com.example.messenger.entities.Thread;
import com.example.messenger.entities.ThreadMessage;
import com.example.messenger.entities.repos.ThreadMessageRepo;
import com.example.messenger.services.ThreadMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class ThreadMessageController {
    @Autowired
    ThreadMessageService threadMessageService;

    @GetMapping("/getByThreadMessageId")
    public ThreadMessage getById(@RequestParam("id") int id){
        return threadMessageService.getById(id);

    }

   @PostMapping("/addNewMessage")
    public ThreadMessage addNewMessage(@RequestBody ThreadMessage threadMessage){
        return threadMessageService.addNewMessage(threadMessage);
   }

   @DeleteMapping("/deleteById")
    public void deleteById(@RequestParam("id") int id){
        threadMessageService.deleteById(id);
   }

   @PutMapping("/updateContent")
    public ThreadMessage setById(@RequestParam("id") int id, @RequestParam("content") String content){
        return threadMessageService.setById(id,content);
   }

   @GetMapping("/getThreadMessages")
    public List<ThreadMessage> getMessage(){
        return threadMessageService.getThreadMessages();
   }


}
