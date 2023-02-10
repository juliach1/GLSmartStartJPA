package com.example.students.controller;

import com.example.students.model.AddressModel;
import com.example.students.service.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressRestController {


    @Autowired
    AddressServiceImpl addressService;


    @GetMapping("/addresses")
    public List<AddressModel> getAddresses(){
        return addressService.findAll();
    }

    @GetMapping("/addresses/{addressId}")
    public AddressModel getAddress(@PathVariable int addressId){
        return addressService.findBy(addressId);
    }

    @PutMapping("/addresses/{addressId}")
    public List<AddressModel> updateAddress(@RequestBody AddressModel addressModel, @PathVariable int addressId){
        addressService.update(addressModel, addressId);

        return addressService.findAll();
    }
}
