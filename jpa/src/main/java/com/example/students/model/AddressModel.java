package com.example.students.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class AddressModel {
    private Integer id;
    private String country;
    private String city;
    private String streetName;
    private String postalCode;
}
