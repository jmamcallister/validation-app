package org.amcallister.validationapp.entities;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
public class User {

    @Size(max = 5)
    private String name;
}
