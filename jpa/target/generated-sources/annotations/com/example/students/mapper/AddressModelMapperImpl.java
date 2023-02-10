package com.example.students.mapper;

import com.example.students.entity.Address;
import com.example.students.model.AddressModel;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-10T19:34:37+0100",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Amazon.com Inc.)"
)
public class AddressModelMapperImpl implements AddressModelMapper {

    @Override
    public Address address(AddressModel addressModel) {
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

    @Override
    public AddressModel addressModel(Address address) {
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
}
