package com.pack.mngodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
public class Product {
    private String prname;
    private int qty;
    private int price;
}
