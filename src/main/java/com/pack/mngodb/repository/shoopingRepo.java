package com.pack.mngodb.repository;

import com.pack.mngodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface shoopingRepo extends MongoRepository<User,Integer> {

    List<User> findByName(String name);

    @Query("{'Address.city':?0}")
    List<User> findByCity(String city);
}
