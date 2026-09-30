package com.example.school.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "enter name please ")
    @Column(columnDefinition = "varchar (10) not null ")
    private String name;

    @NotNull(message = "int not null ")
    @Min(value = 23, message = "age must be 23 or older")
    @Column(columnDefinition = "int check(age >=23)")
    private Integer age;

    @Email
    @NotEmpty(message = "please enter message")
    @Column(columnDefinition = "varchar(30) not null")
    private String email;

    @NotNull(message = "please enter your salary")
    @Positive(message = "please enter positive number")
    @Column(columnDefinition = "int not null check (salary >=1000)")
    private Integer salary;


    @OneToOne(cascade = CascadeType.ALL ,mappedBy = "teacher")
    @PrimaryKeyJoinColumn
    private Address address;

}
