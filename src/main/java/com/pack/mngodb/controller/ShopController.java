package com.pack.mngodb.controller;

import com.pack.mngodb.model.User;
import com.pack.mngodb.repository.shoopingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shopping-Service")
public class ShopController {
    @Autowired
    private shoopingRepo shoppingRepo;

    public ShopController(shoopingRepo shoppingRepo) {
        this.shoppingRepo = shoppingRepo;
    }

    @PostMapping("/orderPlace")
    private String placeOrder(@RequestBody User user) {
        shoppingRepo.save(user);
        return "Order placed successfully";

    }
    //also we can write above method as
    /*
    @PostMapping
    public ResponseEntity <User> saveOrUpdate(@RequestBody User user)
    return new ResponseEntity<User> (shoopingRepo.saveOrUpdate(user),HTTPStatus.ACCEPTED;

     }*/

    @GetMapping("/getUsersByName/{name}")
    public List<User> getUserByName(@PathVariable String name) {
        return shoppingRepo.findByName(name);
    }

    @GetMapping("/getUsersByAddress/{city}")
    public List<User> getUserByAddress(@PathVariable String city) {
        return shoppingRepo.findByCity(city);
    }
}
