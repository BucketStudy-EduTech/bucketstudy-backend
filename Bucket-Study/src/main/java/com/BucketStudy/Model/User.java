package com.BucketStudy.Model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "user")
public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String profileImage;
    private Date enrollmentDate;
    private List<ObjectId> courseEnrolled;
    private List<ObjectId> certificate;

    public User(int id, String name, String email, String password, String role,
                String profileImage, Date enrollmentDate, List<ObjectId> courseEnrolled,
                List<ObjectId> certificate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
        this.profileImage = profileImage;
        this.enrollmentDate = enrollmentDate;
        this.courseEnrolled = courseEnrolled;
        this.certificate = certificate;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public List<ObjectId> getCourseEnrolled() {
        return courseEnrolled;
    }

    public void setCourseEnrolled(List<ObjectId> courseEnrolled) {
        this.courseEnrolled = courseEnrolled;
    }

    public List<ObjectId> getCertificate() {
        return certificate;
    }

    public void setCertificate(List<ObjectId> certificate) {
        this.certificate = certificate;
    }
}