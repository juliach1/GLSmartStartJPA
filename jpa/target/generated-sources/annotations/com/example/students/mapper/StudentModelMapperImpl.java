package com.example.students.mapper;

import com.example.students.entity.Address;
import com.example.students.entity.Student;
import com.example.students.model.AddressModel;
import com.example.students.model.StudentModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T19:34:37+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
public class StudentModelMapperImpl implements StudentModelMapper {

    @Override
    public StudentModel studentModel(Student student) {
        if ( student == null ) {
            return null;
        }

        StudentModel studentModel = new StudentModel();

        studentModel.setId( student.getId() );
        studentModel.setFirstName( student.getFirstName() );
        studentModel.setLastName( student.getLastName() );
        studentModel.setAge( student.getAge() );
        studentModel.setAddress( addressToAddressModel( student.getAddress() ) );

        return studentModel;
    }

    @Override
    public Student student(StudentModel studentModel) {
        if ( studentModel == null ) {
            return null;
        }

        Student student = new Student();

        student.setId( studentModel.getId() );
        student.setFirstName( studentModel.getFirstName() );
        student.setLastName( studentModel.getLastName() );
        student.setAge( studentModel.getAge() );
        student.setAddress( addressModelToAddress( studentModel.getAddress() ) );

        return student;
    }

    protected AddressModel addressToAddressModel(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressModel addressModel = new AddressModel();

        addressModel.setId( address.getId() );
        addressModel.setCountry( address.getCountry() );
        addressModel.setCity( address.getCity() );
        addressModel.setStreetName( address.getStreetName() );
        addressModel.setPostalCode( address.getPostalCode() );

        return addressModel;
    }

    protected Address addressModelToAddress(AddressModel addressModel) {
        if ( addressModel == null ) {
            return null;
        }

        Address address = new Address();

        address.setId( addressModel.getId() );
        address.setCountry( addressModel.getCountry() );
        address.setCity( addressModel.getCity() );
        address.setStreetName( addressModel.getStreetName() );
        address.setPostalCode( addressModel.getPostalCode() );

        return address;
    }
}
