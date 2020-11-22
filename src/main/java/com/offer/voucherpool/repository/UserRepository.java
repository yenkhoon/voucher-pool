package com.offer.voucherpool.repository;

import com.offer.voucherpool.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users, Integer> {
}
