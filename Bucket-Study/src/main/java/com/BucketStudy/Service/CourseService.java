package com.BucketStudy.Service;

import com.BucketStudy.Model.Course;
import com.BucketStudy.Repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    //Create the course
    //only admin can do this
    public Course createCourse(Course course){
        Course save = courseRepo.save(course);
        return save;
    }

    //fecth the course
    //student or admin
    public List<Course> getAllCourse(){
        return courseRepo.findAll();
    }

    //fecth course by course title
    //student and admin
    public Course getCourseTitle(String courseTitle){
        return courseRepo.findByCourseTitle(courseTitle);
    }

   //update course by course title
    //Only admin can do this performance
   public Course updateCourse(Course course){
       Course existingCourse = courseRepo.findByCourseTitle(course.getTitle());


       existingCourse.setCourseId(course.getCourseId());
       existingCourse.setTitle(course.getTitle());
       existingCourse.setDescription(course.getDescription());
       existingCourse.setDuration(course.getDuration());
       existingCourse.setInstructor(course.getInstructor());
       existingCourse.setSkills(course.getSkills());
       existingCourse.setPrice(course.getPrice());
       existingCourse.setVideos(course.getVideos());
       existingCourse.setProjects(course.getProjects());

       return courseRepo.save(existingCourse);
   }

   //Delete the course
    //only admin can do this

}
