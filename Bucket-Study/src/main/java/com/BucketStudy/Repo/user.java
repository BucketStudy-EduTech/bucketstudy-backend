package com.BucketStudy.Repo;

import com.BucketStudy.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface user extends MongoRepository<User,Integer> {
}
