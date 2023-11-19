package com.kloudvista.onetoone.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employees")
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private boolean status;
    //biodetail_bio_id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bio_id")
    private BioDetail bioDetail;

    @OneToMany(cascade = CascadeType.ALL) @JoinColumn(name = "fk_id", referencedColumnName = "id")
    List<Address> address;
}

//EMPLOYEE TO BIODETAIL - Unidirectional
