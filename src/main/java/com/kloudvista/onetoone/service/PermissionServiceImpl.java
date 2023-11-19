package com.kloudvista.onetoone.service;

import com.kloudvista.onetoone.domain.Permission;
import com.kloudvista.onetoone.repository.PermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl {
    @Autowired
    private PermissionRepository permissionRepository;

    public Permission createPermission(Permission permission){
        return permissionRepository.save(permission);
    }

    public List<Permission> getAll(){

        List<Permission> permissions = permissionRepository.findAll();
        return permissions;
    }

}
