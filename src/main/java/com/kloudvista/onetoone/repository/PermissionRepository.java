package com.kloudvista.onetoone.repository;

import com.kloudvista.onetoone.domain.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepository extends JpaRepository<Permission, Long> {
}
