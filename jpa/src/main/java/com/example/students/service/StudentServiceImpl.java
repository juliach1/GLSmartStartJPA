package com.example.students.service;

import com.example.students.entity.Address;
import com.example.students.entity.Student;
import com.example.students.mapper.AddressModelMapper;
import com.example.students.mapper.StudentModelMapper;
import com.example.students.model.AddressModel;
import com.example.students.model.StudentModel;
import com.example.students.repository.AddressRepository;
import com.example.students.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<StudentModel> findAll() {
        return getStudentModelListFromStudentsList(studentRepository.findAll()) ;
    }

    @Override
    public StudentModel findBy(Integer id) {
        return getStudentModelFromStudent( studentRepository.findById(id).orElse(new Student()) );
    }

    @Override
    public void delete(Integer id) {
         studentRepository.deleteById(id);
    }

    @Override
    public void save(StudentModel studentModel) {
        studentRepository.save(StudentModelMapper.instance.student(studentModel));
    }

    @Override
    public void update(StudentModel studentModel, int studentId) {
        Student student = getStudentFromStudentModel(studentModel);
        student.setId(studentId);
        studentRepository.save(student);
    }

    @Override
    public void updateAddress(int studentId, AddressModel addressModel) {
        Student student = getStudentFromStudentModel( findBy(studentId) );
        student.setAddress( AddressModelMapper.instance.address(addressModel) );

        studentRepository.save(student);
    }

    private Student getStudentFromStudentModel(StudentModel studentModel){
       return StudentModelMapper.instance.student(studentModel);
    }
    private StudentModel getStudentModelFromStudent(Student student){
        return StudentModelMapper.instance.studentModel(student);
    }

    private List<StudentModel> getStudentModelListFromStudentsList(List<Student> students){
        List<StudentModel> models = new LinkedList<>();
        for (Student student : students){
            models.add( getStudentModelFromStudent(student) );
        }
        return models;
    }
}
