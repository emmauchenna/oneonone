package com.kloudvista.onetoone.repository;

import com.kloudvista.onetoone.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
