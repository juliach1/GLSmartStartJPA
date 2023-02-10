package com.example.students.mapper;

import com.example.students.entity.Address;
import com.example.students.model.AddressModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AddressModelMapper {
    AddressModelMapper instance = Mappers.getMapper(AddressModelMapper.class);

    @Mappings({})
    Address address(AddressModel addressModel);

    @Mappings({})
    AddressModel addressModel(Address address);
}
