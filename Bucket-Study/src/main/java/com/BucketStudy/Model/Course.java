package com.BucketStudy.Model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
public class Course {
    @Id
    private int courseId;
    private String title;
    private String description;
    private int duration; //in hours
    private ObjectId instructor;
    private List<String> skills;
    private double price;
    private List<String> videos;
    private List<ObjectId> projects;

    public Course(int courseId, String title, String description, int duration, ObjectId instructor,
                  List<String> skills, double price, List<String> videos, List<ObjectId> projects) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructor = instructor;
        this.skills = skills;
        this.price = price;
        this.videos = videos;
        this.projects = projects;
    }

    public Course() {
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ObjectId getInstructor() {
        return instructor;
    }

    public void setInstructor(ObjectId instructor) {
        this.instructor = instructor;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getVideos() {
        return videos;
    }

    public void setVideos(List<String> videos) {
        this.videos = videos;
    }

    public List<ObjectId> getProjects() {
        return projects;
    }

    public void setProjects(List<ObjectId> projects) {
        this.projects = projects;
    }
}
