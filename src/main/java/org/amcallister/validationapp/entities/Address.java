package org.amcallister.validationapp.entities;

import lombok.Data;

import javax.validation.constraints.Size;

@Data
class Address {

    @Size(max = 2)
    private String country;
}
