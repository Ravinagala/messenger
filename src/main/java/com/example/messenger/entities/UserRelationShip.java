package com.example.messenger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="user_relationship")
public class UserRelationShip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user1_id")
    private int user1id;

    @Column(name="user2_id")
    private int user2id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user1_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user1;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user2_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser1id() {
        return user1id;
    }

    public void setUser1id(int user1id) {
        this.user1id = user1id;
    }

    public int getUser2id() {
        return user2id;
    }

    public void setUser2id(int user2id) {
        this.user2id = user2id;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }
}
