package com.pratian.PetService.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pet {

    private long petId;

    private String petName;

    private float age;

    private String gender;

    private String bloodGroup;

    private String species;

    private String dateOfBirth;

    private String allergy;

    private String profilePic;

}
