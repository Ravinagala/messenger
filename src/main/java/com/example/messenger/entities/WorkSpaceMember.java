package com.example.messenger.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name="workspace_members")
public class WorkSpaceMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="user_id")
    private int user_id;

    @Column(name="workspace_id")
    private int workspaceid;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="user_id", referencedColumnName = "id", insertable = false, updatable = false)
    private User user;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="workspace_id", referencedColumnName = "id", insertable = false, updatable = false)
    private WorkSpace workSpace;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getWorkspaceid() {
        return workspaceid;
    }

    public void setWorkspaceid(int workspaceid) {
        this.workspaceid = workspaceid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public WorkSpace getWorkSpace() {
        return workSpace;
    }

    public void setWorkSpace(WorkSpace workSpace) {
        this.workSpace = workSpace;
    }
}
