package com.BucketStudy.Repository;

import com.BucketStudy.Model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface CourseRepository extends MongoRepository<Course, String> {
    List<Course> findByInstructor(int instructorId);
    List<Course> findBySkillsContaining(String skill);
    List<Course> findByPriceLessThan(double price);
    List<Course> findByDurationGreaterThan(int duration);
    List<Course> findByTitleContainingIgnoreCase(String keyword);
}

