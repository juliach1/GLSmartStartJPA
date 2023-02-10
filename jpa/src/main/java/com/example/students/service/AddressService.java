package com.example.students.service;

import com.example.students.model.AddressModel;
import com.example.students.model.StudentModel;

import java.util.List;

public interface AddressService {

    List<AddressModel> findAll();
    AddressModel findBy(Integer id);

    void update(AddressModel studentModel, int studentId);
}
