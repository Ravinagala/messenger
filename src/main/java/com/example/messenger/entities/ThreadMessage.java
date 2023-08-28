package com.example.messenger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name="thread_messages")
public class ThreadMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int userid;

    @Column(name="thread_id")
    private int threadid;

    @Column(name="content")
    private String content;

    @Column(name="timestamp")
    private LocalDateTime timestamp;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="thread_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Thread thread;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getThreadid() {
        return threadid;
    }

    public void setThreadid(int threadid) {
        this.threadid = threadid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }
}
