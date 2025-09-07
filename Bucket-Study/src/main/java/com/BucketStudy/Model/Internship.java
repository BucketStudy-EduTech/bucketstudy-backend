package com.BucketStudy.Model;

import jakarta.validation.constraints.NotBlank;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "internship")
public class Internship {

    @Id
    private String id; // Using String to avoid ObjectId conversion issues

    @NotBlank(message = "Title need to be inserted")
    private String title;
    @NotBlank(message = "Must fill the company name")
    private String company;
    @NotBlank(message = "Must fill the duration")
    private int duration; // in months
    private List<String> requirements;
    @NotBlank(message = "Must fill the application deadline")
    private Date applicationDeadline;
    private List<ObjectId> selectedStudent;
    private String status;

    public Internship() {}

    public Internship(String title, String company, int duration, List<String> requirements,
                      Date applicationDeadline, List<ObjectId> selectedStudent, String status) {
        this.title = title;
        this.company = company;
        this.duration = duration;
        this.requirements = requirements;
        this.applicationDeadline = applicationDeadline;
        this.selectedStudent = selectedStudent;
        this.status = status;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getCompany() { return company; }
    public void setCompany(String company) { this.company = company; }

    public int getDuration() { return duration; }
    public void setDuration(int duration) { this.duration = duration; }

    public List<String> getRequirements() { return requirements; }
    public void setRequirements(List<String> requirements) { this.requirements = requirements; }

    public Date getApplicationDeadline() { return applicationDeadline; }
    public void setApplicationDeadline(Date applicationDeadline) { this.applicationDeadline = applicationDeadline; }

    public List<ObjectId> getSelectedStudent() { return selectedStudent; }
    public void setSelectedStudent(List<ObjectId> selectedStudent) { this.selectedStudent = selectedStudent; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
