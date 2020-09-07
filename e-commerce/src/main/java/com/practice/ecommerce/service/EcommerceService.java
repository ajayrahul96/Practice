package com.practice.ecommerce.service;

import com.practice.ecommerce.dao.entity.EcommerceEntity;
import com.practice.ecommerce.dao.repository.EcommerceJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class EcommerceService {
    @Autowired
    EcommerceJPARepository ecommerceJPARepository;

    public List<EcommerceEntity> getAllEcommerce() {

        List<EcommerceEntity>  ecommerceEntityList= (List<EcommerceEntity>) ecommerceJPARepository.findAll();

        return ecommerceEntityList;
    }
    public Optional<EcommerceEntity> getEcommerce(Integer product_ID){

        return ecommerceJPARepository.findById(product_ID);
    }


    public void createEcommerce(EcommerceEntity ecommerceEntity){
        ecommerceJPARepository.save(ecommerceEntity);
    }

    public void deleteEcommerceByID(Integer product_ID){
        ecommerceJPARepository.deleteById(product_ID);
    }
}
