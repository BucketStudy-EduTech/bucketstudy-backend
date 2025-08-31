package com.BucketStudy.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BucketStudy.Model.Course;
import com.BucketStudy.Repository.CourseRepository;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(int id) {
        return courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found with id: " + id));
    }

    public Course updateCourse(int id, Course updatedCourse) {
        Course existing = getCourseById(id);
        existing.setTitle(updatedCourse.getTitle());
        existing.setDescription(updatedCourse.getDescription());
        existing.setDuration(updatedCourse.getDuration());
        existing.setInstructor(updatedCourse.getInstructor());
        existing.setSkills(updatedCourse.getSkills());
        existing.setPrice(updatedCourse.getPrice());
        existing.setVideos(updatedCourse.getVideos());
        existing.setProjects(updatedCourse.getProjects());
        return courseRepository.save(existing);
    }

    public void deleteCourse(int id) {
        courseRepository.deleteById(id);
    }

    public List<Course> getCoursesByInstructor(int instructorId) {
        return courseRepository.findByInstructor(instructorId);
    }


    public List<Course> getCoursesByPriceLessThan(double price) {
        return courseRepository.findByPriceLessThan(price);
    }

    public List<Course> getCoursesByDurationGreaterThan(int hours) {
        return courseRepository.findByDurationGreaterThan(hours);
    }

    
}

