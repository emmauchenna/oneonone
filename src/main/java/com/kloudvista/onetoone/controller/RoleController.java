package com.kloudvista.onetoone.controller;


import com.kloudvista.onetoone.domain.Permission;
import com.kloudvista.onetoone.domain.Role;
import com.kloudvista.onetoone.dtos.RoleDto;
import com.kloudvista.onetoone.dtos.RoleDto2;
import com.kloudvista.onetoone.service.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String createRole(@RequestBody RoleDto role){
        roleService.createRole(role);
        return "success";
    }

    @RequestMapping(value = "/createWithPermission", method = RequestMethod.POST)
    public Role createRoleWithPermission(@RequestBody RoleDto2 role){
       return roleService.createRoleWithPermission(role);
    }

    @RequestMapping(value = "/addPermission/{roleId}", method = RequestMethod.POST)
    public String createRole(long roleId, List< Permission> PermissionList){
        Role role = roleService.addPermissionToRole(roleId, PermissionList);
        if(role!= null){
        return "success";
        }
        return "failed";
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Role> getRoles(){
        List<Role> allRoles = roleService.getAllRoles();
        return allRoles;
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Role getRoleById(@RequestParam long roleId){
        Role role = roleService.getRoleById(roleId);
        return role;
    }
}
