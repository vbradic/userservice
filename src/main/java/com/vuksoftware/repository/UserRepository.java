package com.vuksoftware.repository;

import com.vuksoftware.model.User;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User ,String> {
}
