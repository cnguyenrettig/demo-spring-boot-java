package com.example.demospringboothello;

import com.example.entity.facilitator.Facilitator;
import com.example.entity.facilitator.Instructor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {

    @GetMapping(value="/hello")
    public String callHello(){
        return "Hello World!";
    }


    @RequestMapping(value="/facilitator", method = RequestMethod.GET)
    public @ResponseBody String getFacilitator(@RequestParam("name") String firstName){
        Facilitator facilitator = new Facilitator();

        if(firstName.equalsIgnoreCase("jason")){
            facilitator.setFirstName("Jason");
            facilitator.setLastName("McKee-Bakos");
        }
        else if(firstName.equalsIgnoreCase("marcus")){
            facilitator.setFirstName("Marcus");
            facilitator.setLastName("Chiriboga");
        }
        else {
            facilitator.setFirstName("");
            facilitator.setLastName("");

        }

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(facilitator);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @RequestMapping(value="/instructor", method = RequestMethod.GET)
    public @ResponseBody String getInstructor(@RequestParam("name") String firstName){
        Instructor instructor = new Instructor("Chi","Nguyen","Java Foundations");


        ObjectMapper objectMapper = new ObjectMapper();

        try {
            return objectMapper.writeValueAsString(instructor);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}