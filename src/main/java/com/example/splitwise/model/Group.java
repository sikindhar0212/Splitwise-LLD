package com.example.splitwise.model;

import java.util.List;

public class Group {
    private Long id;
    private String name;
    private List<User> members;

    public Group() {}

    public Group(Long id, String name, List<User> members) {
        this.id = id;
        this.name = name;
        this.members = members;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<User> getMembers() {
        return members;
    }
    public void setMembers(List<User> members) {
        this.members = members;
    }
}
