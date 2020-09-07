package com.practice.ecommerce.dao.repository;

import com.practice.ecommerce.dao.entity.EcommerceEntity;
import org.springframework.data.repository.CrudRepository;


public interface EcommerceJPARepository extends CrudRepository<EcommerceEntity,Integer> {



}
