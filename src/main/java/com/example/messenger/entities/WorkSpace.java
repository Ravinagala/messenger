package com.example.messenger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="workspace")
public class WorkSpace {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;


    @OneToMany(mappedBy = "workSpace")
    @JsonIgnore
    private List<WorkSpaceMember> workSpaceMembers;

    @OneToMany(mappedBy = "workSpace")
    @JsonIgnore
    private List<Thread> threads;

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

    public List<WorkSpaceMember> getWorkSpaceMembers() {
        return workSpaceMembers;
    }

    public void setWorkSpaceMembers(List<WorkSpaceMember> workSpaceMembers) {
        this.workSpaceMembers = workSpaceMembers;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }
}
