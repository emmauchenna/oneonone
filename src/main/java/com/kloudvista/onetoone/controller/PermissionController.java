package com.kloudvista.onetoone.controller;


import com.kloudvista.onetoone.domain.Permission;
import com.kloudvista.onetoone.service.PermissionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/permission")
public class PermissionController {

    @Autowired
    private PermissionServiceImpl permissionService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Permission createPermission(@RequestBody Permission permission){
       return permissionService.createPermission(permission);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Permission> getAll(){
        List<Permission> permissions = permissionService.getAll();
        return permissions;
    }
}

