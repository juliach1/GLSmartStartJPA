package com.example.students.mapper;

import com.example.students.entity.Student;
import com.example.students.model.StudentModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentModelMapper {

    StudentModelMapper instance = Mappers.getMapper(StudentModelMapper.class);

    @Mappings({})
    StudentModel studentModel(Student student);

    @Mappings({})
    Student student(StudentModel studentModel);
}
