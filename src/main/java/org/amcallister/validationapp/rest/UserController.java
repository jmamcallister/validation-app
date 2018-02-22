package org.amcallister.validationapp.rest;

import org.amcallister.validationapp.entities.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping
    public String createUser(@RequestBody @Valid Person userToCreate) {
        return String.format("valid user %s", userToCreate.toString());
    }
}
