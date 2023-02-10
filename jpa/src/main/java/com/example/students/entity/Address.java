package com.example.students.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="COUNTRY")
    private String country;

    @Column(name="CITY")
    private String city;

    @Column(name="STREET_NAME")
    private String streetName;

    @Column(name="POSTAL_CODE")
    private String postalCode;
}
