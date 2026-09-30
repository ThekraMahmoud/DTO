package com.example.school.Service;

import com.example.school.Api.ApiException;
import com.example.school.DTO.AddressDTO;
import com.example.school.Model.Address;
import com.example.school.Model.Teacher;
import com.example.school.Repository.AddressRepository;
import com.example.school.Repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;

    private final TeacherRepository teacherRepository;

    public List<Address> get(){
       return addressRepository.findAll();
    }


    public void add(AddressDTO addressDTO){
        Teacher teacher=teacherRepository.findTeacherById(addressDTO.getTeacher_id());

        if(teacher==null){
            throw new ApiException("teacher id not found ");
        }
        Address address=new Address(null,addressDTO.getArea(),addressDTO.getStreet(),addressDTO.getBuildingNumber(),teacher);
        addressRepository.save(address);
    }


    public void update(AddressDTO addressDTO){

        Teacher teacher=teacherRepository.findTeacherById(addressDTO.getTeacher_id());
        if(teacher==null){
            throw new ApiException("teacher id not found ");
        }
        Address address=new Address();
        address.setArea(addressDTO.getArea());
        address.setBuildingNumber(addressDTO.getBuildingNumber());
        address.setStreet(addressDTO.getStreet());
    }

    public void delete(Integer id){
        Address address=addressRepository.findAddressById(id);
        if(address==null){
            throw new ApiException("teacher id not found ");
        }
        addressRepository.delete(address);

    }
}
