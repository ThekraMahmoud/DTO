package com.example.school.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    private Integer id;


    @NotNull(message = "please Enter area")
    @Positive(message = "It must be greater than zero")
    @Column(columnDefinition = "int not null ")
    private Integer area;


    @NotBlank(message = "please enter street ")
    @Column(columnDefinition = "varchar(20) not null ")
    private String street;

    @NotNull(message = "please enter building Number")
    @Positive(message = "Building number must be greater than zero")
    @Column(columnDefinition = "int not null")
    private Integer buildingNumber;



    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;

}
