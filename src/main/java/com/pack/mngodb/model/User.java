package com.pack.mngodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection ="order_db" )
//@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    private int id;
    private String name;
    private String gender;
    private List<Product> productList;
    private Address address;

    public User(String name, String gender, List<Product> productList, Address address) {
        this.name = name;
        this.gender = gender;
        this.productList = productList;
        this.address = address;
    }
}
