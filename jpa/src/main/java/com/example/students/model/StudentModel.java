package com.example.students.model;
import lombok.Data;

@Data
public class StudentModel {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private AddressModel address;
}
