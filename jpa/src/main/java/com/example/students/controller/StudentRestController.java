package com.example.students.controller;

import com.example.students.model.AddressModel;
import com.example.students.model.StudentModel;
import com.example.students.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentRestController {

    @Autowired
    StudentServiceImpl studentService;


    @GetMapping("/students")
    public List<StudentModel> getStudents(){
        return studentService.findAll();
    }

    @GetMapping("/students/{studentId}")
    public StudentModel getStudent(@PathVariable int studentId){
        return studentService.findBy(studentId);
    }

    @DeleteMapping("/students/{studentId}")
    public StudentModel deleteStudent(@PathVariable int studentId){
        StudentModel studentModel = studentService.findBy(studentId);
        studentService.delete(studentId);

        return studentModel;
    }

    @PostMapping("/students")
    public List<StudentModel> addStudent(@RequestBody StudentModel studentModel){
        studentService.save(studentModel);

        return studentService.findAll();
    }

    @PutMapping("/students/{studentId}")
    public List<StudentModel> updateStudent(@RequestBody StudentModel studentModel, @PathVariable int studentId){
        studentService.update(studentModel, studentId);

        return studentService.findAll();
    }

    @PatchMapping("/students/{studentId}")
    public List<StudentModel> updateStudentAddress(@RequestBody AddressModel addressModel, @PathVariable int studentId){

        studentService.updateAddress(studentId, addressModel);

        return studentService.findAll();
   }
//
//    @PatchMapping("/students/{studentId}")
//    public List<StudentModel> updateStudentAddress(@RequestBody int addressId, @PathVariable int studentId){
//
//        studentService.updateAddress(studentId, addressId);
//
//        return studentService.findAll();
//    }
}
