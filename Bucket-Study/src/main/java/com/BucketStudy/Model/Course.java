package com.BucketStudy.Model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "courses")
public class Course {

    @Id
    private int id;

    private String title;
    private String description;
    private int duration; // in hours
    private int instructor;
    private List<String> skills;
    private double price;
    private List<String> videos;
    private List<Integer> projects;

    // --- Constructors ---
    public Course() {}

    public Course(String title, String description, int duration, int instructor,
                  List<String> skills, double price, List<String> videos, List<Integer> projects) {
        this.title = title;
        this.description = description;
        this.duration = duration;
        this.instructor = instructor;
        this.skills = skills;
        this.price = price;
        this.videos = videos;
        this.projects = projects;
    }

    // --- Getters and Setters ---

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getInstructor() {
        return instructor;
    }

    public void setInstructor(int instructor) {
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

    public List<Integer> getProjects() {
        return projects;
    }

    public void setProjects(List<Integer> projects) {
        this.projects = projects;
    }
}

