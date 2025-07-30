package com.BucketStudy.Repo;

import com.BucketStudy.Model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends MongoRepository<Course, Integer> {
}
