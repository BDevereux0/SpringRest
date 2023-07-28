package com.example.springrest.sendingObjects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//uncomment @RestController for proper function
//@RestController
public class ObjectController {

    @GetMapping("/USA")
    public Country USA(){
        Country c = Country.of("USA", 10);
        return c;
    }

    @GetMapping("/listOfCountries")
    public List<Country> countries(){
        List<Country> list = new ArrayList<>();
        Country c = Country.of("France", 67);
        Country c1 = Country.of("USA", 100);
        Country c2 = Country.of("Canada", 50);
        list.add(c);
        list.add(c1);
        list.add(c2);

        return list;
    }

    @GetMapping("/responseEntity")
    public ResponseEntity responseEntity(){
        Country c = Country.of("USA", 100);

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent" , "North America")
                .header("capital", "Washington DC")
                .header("favorite food", "burgers")
                .body(c);
    }

}
