package com.example.splitwise.service;

import com.example.splitwise.model.Group;
import java.util.ArrayList;
import java.util.List;

public class GroupService {
    private List<Group> groups = new ArrayList<>();

    public Group addGroup(Group group) {
        groups.add(group);
        return group;
    }

    public List<Group> getAllGroups() {
        return groups;
    }
}