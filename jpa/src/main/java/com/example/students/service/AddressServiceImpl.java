package com.example.students.service;

import com.example.students.entity.Address;
import com.example.students.mapper.AddressModelMapper;
import com.example.students.model.AddressModel;
import com.example.students.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<AddressModel> findAll() {
        return getAddressModelListFromAddresses( addressRepository.findAll() );
    }

    @Override
    public AddressModel findBy(Integer id) {
        return getAddressModelFromAddress( addressRepository.findById(id).orElse(new Address()) );
    }

    @Override
    public void update(AddressModel addressModel, int addressId) {
        Address address = getAddressFromAddressModel(addressModel);
        address.setId(addressId);

        addressRepository.save(address);
    }

    private Address getAddressFromAddressModel(AddressModel addressModel){
        return AddressModelMapper.instance.address(addressModel);
    }

    private AddressModel getAddressModelFromAddress(Address address){
        return AddressModelMapper.instance.addressModel(address);
    }

    private List<AddressModel> getAddressModelListFromAddresses(List<Address> addresses){
        List<AddressModel>  addressModels = new LinkedList<>();
        for (Address address : addresses){
            addressModels.add( getAddressModelFromAddress(address) );
        }
        return addressModels;
    }
}
