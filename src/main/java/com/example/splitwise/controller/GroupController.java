package com.example.splitwise.controller;

import com.example.splitwise.model.Group;
import com.example.splitwise.service.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    private final GroupService groupService = new GroupService();

    @PostMapping
    public Group createGroup(@RequestBody Group group) {
        return groupService.addGroup(group);
    }

    @GetMapping
    public List<Group> getAllGroups() {
        return groupService.getAllGroups();
    }
}