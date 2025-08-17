
package com.BucketStudy.Repo;

import com.BucketStudy.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends MongoRepository<User,Integer> {
    //custom query for find by email
    Optional<User> findByEmail(String email);
}
