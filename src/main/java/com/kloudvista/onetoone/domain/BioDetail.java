package com.kloudvista.onetoone.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "bio_details")
@Entity
public class BioDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bio_id")
    private long id;
    @Column(name = "dob")
    private LocalDate dateOfBirth;
    private double height;
    private double weight;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "bioDetail" )
    @JsonIgnore
    Employee employee;
}
