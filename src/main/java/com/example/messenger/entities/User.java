package com.example.messenger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<WorkSpaceMember> workSpaceMembers;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<ThreadMessage> threadMessages;

    @OneToMany(mappedBy = "user1")
    @JsonIgnore
    private List<UserRelationShip> userRelationShips1;

    @OneToMany(mappedBy = "user2")
    @JsonIgnore
    private List<UserRelationShip> userRelationShips2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<WorkSpaceMember> getWorkSpaceMembers() {
        return workSpaceMembers;
    }

    public void setWorkSpaceMembers(List<WorkSpaceMember> workSpaceMembers) {
        this.workSpaceMembers = workSpaceMembers;
    }

    public List<ThreadMessage> getThreadMessages() {
        return threadMessages;
    }

    public void setThreadMessages(List<ThreadMessage> threadMessages) {
        this.threadMessages = threadMessages;
    }

    public List<UserRelationShip> getUserRelationShips1() {
        return userRelationShips1;
    }

    public void setUserRelationShips1(List<UserRelationShip> userRelationShips1) {
        this.userRelationShips1 = userRelationShips1;
    }

    public List<UserRelationShip> getUserRelationShips2() {
        return userRelationShips2;
    }

    public void setUserRelationShips2(List<UserRelationShip> userRelationShips2) {
        this.userRelationShips2 = userRelationShips2;
    }
}
