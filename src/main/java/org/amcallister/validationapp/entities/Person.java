package org.amcallister.validationapp.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.validation.Valid;

@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends User {

    @Valid
    private Address address;
}
