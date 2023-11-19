package com.kloudvista.onetoone.service;

import com.kloudvista.onetoone.domain.Permission;
import com.kloudvista.onetoone.domain.Role;
import com.kloudvista.onetoone.dtos.RoleDto;
import com.kloudvista.onetoone.dtos.RoleDto2;
import com.kloudvista.onetoone.repository.PermissionRepository;
import com.kloudvista.onetoone.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl {

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PermissionRepository permissionRepository;

    public void createRole(RoleDto roleDto){
        Role role = new Role();
        role.setDescription(roleDto.getDescription());
        role.setName(roleDto.getName());
        roleRepository.save(role);
    }


    public Role createRoleWithPermission(RoleDto2 roleDto2){
        Role role = new Role();
        role.setDescription(roleDto2.getDescription());
        role.setName(roleDto2.getName());
        role.setPermissions(roleDto2.getPermissions());
        return roleRepository.save(role);
    }


    public Role addPermissionToRole(long roleId, List<Permission> permissionIdList){

        Role role = roleRepository.findById(roleId).get();
        role.setPermissions(permissionIdList);
        return roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        List<Role> roleList = roleRepository.findAll();
        return roleList;
    }

    public Role getRoleById(long roleId) {
        Optional<Role> byId = roleRepository.findById(roleId);
        if(byId.isPresent()){
            return byId.get();
        }
        return new Role();
    }
}
