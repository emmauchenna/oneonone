package com.kloudvista.onetoone.dtos;

import com.kloudvista.onetoone.domain.Permission;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RoleDto2 {
    private String name;
    private String description;
    List<Permission> permissions = new ArrayList<>();
}
