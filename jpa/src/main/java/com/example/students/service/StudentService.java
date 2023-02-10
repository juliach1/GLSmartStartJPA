package com.example.students.service;

import com.example.students.model.AddressModel;
import com.example.students.model.StudentModel;

import java.util.List;

public interface StudentService {

    List<StudentModel> findAll();
    StudentModel findBy(Integer id);

    void delete(Integer id);

    void save(StudentModel studentModel);

    void update(StudentModel studentModel, int studentId);

    void updateAddress(int studentId, AddressModel addressModel);
}
