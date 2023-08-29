package com.example.messenger.services;

import com.example.messenger.entities.ThreadMessage;

import java.util.List;

public interface ThreadMessageService {
    ThreadMessage addNewMessage(ThreadMessage threadMessage);

    ThreadMessage getById(int id);

    void deleteById(int id);

    ThreadMessage setById(int id, String content);

    List<ThreadMessage> getThreadMessages();
}
