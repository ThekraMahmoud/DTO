package com.example.school.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressDTO {
    private Integer area;
    private String street;
    private Integer buildingNumber;
    private Integer teacher_id
            ;
}
