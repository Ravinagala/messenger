package com.example.messenger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="threads")
public class Thread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="workspace_id")
    private int workspaceid;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="workspace_id", referencedColumnName = "id", insertable = false, updatable = false)
    private WorkSpace workSpace;

    @OneToMany(mappedBy = "thread")
    @JsonIgnore
    private List<ThreadMessage> threadMessages;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWorkspaceid() {
        return workspaceid;
    }

    public void setWorkspaceid(int workspaceid) {
        this.workspaceid = workspaceid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
    }

    public List<ThreadMessage> getThreadMessages() {
        return threadMessages;
    }

    public void setThreadMessages(List<ThreadMessage> threadMessages) {
        this.threadMessages = threadMessages;
    }
}
