package com.BucketStudy.Controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.BucketStudy.Model.Course;
import com.BucketStudy.Service.CourseService;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping("/addCourse")
	public ResponseEntity<Course> createCourse(@RequestBody Course course) {
		return ResponseEntity.ok(courseService.createCourse(course));
	}
	
	 @GetMapping("/")
	 public String home() {
		 LocalDate today = LocalDate.of(2025, 6, 9);
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         String formattedDate = today.format(formatter);
         System.out.println("Formatted Date: " + formattedDate);
		 	
	        return "Spring Boot MongoDB API is running!"+ formattedDate;
	   }

	@GetMapping("/getAllCourses")
	public ResponseEntity<List<Course>> getAllCourses() {
		return ResponseEntity.ok(courseService.getAllCourses());
	}
	

	@GetMapping("/{id}")
	public ResponseEntity<Course> getCourseById(@PathVariable int id) {
		return ResponseEntity.ok(courseService.getCourseById(id));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Course> updateCourse(@PathVariable int id, @RequestBody Course updatedCourse) {
		return ResponseEntity.ok(courseService.updateCourse(id, updatedCourse));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCourse(@PathVariable int id) {
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
