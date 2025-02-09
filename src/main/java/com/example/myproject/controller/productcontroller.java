package com.example.myproject.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

@RestController
public class productcontroller {

    @GetMapping("/products/{id}")
    public void getAllProduct(@PathVariable("id") Integer id) { // path varialble way to get parameter
        // from


    }
    @PostMapping("/products")
    public void createProduct() {

    }
    @GetMapping("/products")
    public void getProductbyId(){

    }
    @PutMapping("/product/{id}")
    public void UpdateProduct(@PathVariable("id") Integer id){

    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable("id") Integer id){

    }
}
// how will i tell my spring that this is special controller? i will use @Restcontroller
// i will have to create api in order to communicate.
// api is contract that handled by function
// if any function is not mapped its not web api
//when we are using requestmapping its just a general term while
// getmapping postmapping deletemapping are more specific to http request
//after mapping all the function now all these crud function is web api
// we will get json as responce but java dont know json
//json looks like "key:value" its key value pair
// java does not understand only object it does not understand json
// it is responsibility of my spring to convert that json
//now we will create dto "data transfer object"
//whenever we return the data frontend will req to controller in json format now it is reponcebility
// of spring to change into object
//now my spring framework will change that from json to java object
