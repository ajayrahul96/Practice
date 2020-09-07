package com.practice.ecommerce.controller;

import com.practice.ecommerce.dao.entity.EcommerceEntity;
import com.practice.ecommerce.service.EcommerceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {
    @Autowired
    EcommerceService ecommerceService;

    @GetMapping("/get")
    public ResponseEntity<List<EcommerceEntity>> getEcommerce(){

        ResponseEntity responseEntity=ResponseEntity.ok(ecommerceService.getAllEcommerce());

        return responseEntity;

    }
    @GetMapping("/get/{product-id}")
    public ResponseEntity<EcommerceEntity> getEcommerce(@PathVariable(name = "product-id") Integer product_ID){

        ResponseEntity responseEntity=ResponseEntity.ok(ecommerceService.getEcommerce(product_ID));

        return responseEntity;

    }

    @PostMapping("/create")
    public void createEcommerce(@RequestBody EcommerceEntity ecommerceEntity){

        ecommerceService.createEcommerce(ecommerceEntity);
    }

    @DeleteMapping("/delete/{product-id}")
    public void deleteEcommerce(@PathVariable(name = "product-id") Integer ecommerceID){
        ecommerceService.deleteEcommerceByID(ecommerceID);    }

}
