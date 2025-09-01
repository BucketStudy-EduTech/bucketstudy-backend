package com.BucketStudy.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BucketStudy.Model.Course;
import com.BucketStudy.Service.CourseService;


@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:5173")

public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping("/addCourse")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		return ResponseEntity.ok(courseService.createCourse(course));
	}
	

	@GetMapping("/getAllCourses")
	public ResponseEntity<List<Course>> getAllCourses() {
		return ResponseEntity.ok(courseService.getAllCourses());
	}
	

	@GetMapping("/getCourseById/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable String id) {
		return ResponseEntity.ok(courseService.getCourseById(id));
	}

	@PutMapping("/updateCourse/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable String id, @RequestBody Course updatedCourse) {
		return ResponseEntity.ok(courseService.updateCourse(id, updatedCourse));
	}

	@DeleteMapping("/deleteCourse/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable String id) {
		courseService.deleteCourse(id);
		return ResponseEntity.noContent().build();
	}

	// Custom: Find by Instructor
	@GetMapping("/instructor/{instructorId}")
	public ResponseEntity<List<Course>> getCoursesByInstructor(@PathVariable int instructorId) {
		return ResponseEntity.ok(courseService.getCoursesByInstructor( (instructorId)));
	}


	// Custom: Price filter
	@GetMapping("/price/less-than/{price}")
	public ResponseEntity<List<Course>> getCoursesByPriceLessThan(@PathVariable double price) {
		return ResponseEntity.ok(courseService.getCoursesByPriceLessThan(price));
	}

	// Custom: Duration filter
	@GetMapping("/duration/greater/{hours}")
	public ResponseEntity<List<Course>> getCoursesByDurationGreater(@PathVariable int hours) {
		return ResponseEntity.ok(courseService.getCoursesByDurationGreaterThan(hours));
	}

	
}
