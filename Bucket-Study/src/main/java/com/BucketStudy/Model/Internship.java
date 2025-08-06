package com.BucketStudy.Model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "internship")
public class Internship {
    private String Title;
    private String Company;
    private int Duration; //in months
    private List<String> Requirements;
    private Date ApplicationDeadline;
    private List<ObjectId> SelectedStudent;
    private String Status;

    public Internship(String title, String company, int duration, List<String> requirements,
                      Date applicationDeadline, List<ObjectId> selectedStudent, String status) {
        Title = title;
        Company = company;
        Duration = duration;
        Requirements = requirements;
        ApplicationDeadline = applicationDeadline;
        SelectedStudent = selectedStudent;
        Status = status;
    }

    public Internship() {
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getCompany() {
        return Company;
    }

    public void setCompany(String company) {
        Company = company;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public List<String> getRequirements() {
        return Requirements;
    }

    public void setRequirements(List<String> requirements) {
        Requirements = requirements;
    }

    public Date getApplicationDeadline() {
        return ApplicationDeadline;
    }

    public void setApplicationDeadline(Date applicationDeadline) {
        ApplicationDeadline = applicationDeadline;
    }

    public List<ObjectId> getSelectedStudent() {
        return SelectedStudent;
    }

    public void setSelectedStudent(List<ObjectId> selectedStudent) {
        SelectedStudent = selectedStudent;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
