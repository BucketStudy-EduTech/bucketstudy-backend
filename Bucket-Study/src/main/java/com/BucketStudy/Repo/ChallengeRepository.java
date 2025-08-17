package com.BucketStudy.Repo;


import com.BucketStudy.Model.Challenge;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChallengeRepository extends MongoRepository<Challenge, String> {
    // Custom queries can be added here if needed later
}

