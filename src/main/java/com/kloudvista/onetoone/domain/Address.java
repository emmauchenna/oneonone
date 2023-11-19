package com.kloudvista.onetoone.domain;


import com.kloudvista.onetoone.enums.AddressType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.nio.channels.UnsupportedAddressTypeException;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee_address")
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bio_id")
    private long id;
    private String streetName;
    private String city;
    private String state;
    private AddressType addressType;

    @ManyToOne
    Employee employee;

}
