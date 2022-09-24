package com.example.entity.facilitator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;


public class Facilitator {
    //define properties
    @JsonProperty(value = "first name")
    private String firstName;
    @JsonProperty(value = "last name")
    private String lastName;

    //define getter/setter


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
