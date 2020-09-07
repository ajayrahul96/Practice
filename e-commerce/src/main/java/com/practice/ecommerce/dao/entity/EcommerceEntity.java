package com.practice.ecommerce.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


    @Entity
    @Data
    @Table(name = "ecommerce")
    public class EcommerceEntity {
        @Id
        private Integer product_id;
        private String product_name;


    }


