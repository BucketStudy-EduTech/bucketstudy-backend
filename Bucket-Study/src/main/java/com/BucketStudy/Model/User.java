package com.BucketStudy.Model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;
import java.sql.ConnectionBuilder;
import java.util.Date;
import java.util.List;

@Document(collection = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private ObjectId  id;
    @NotBlank(message = "Name should be filled")
    private String name;
    @NotBlank(message = "Email need to be filled")
    @Email(message = "Enter a valid email")
    private String email;
    @NotBlank(message = "Password should not to be empty.")
    private String password;
    @NotBlank(message = "Please enter your role")
    private Role role;
    private String profileImage;
    @NotBlank(message = "Fill today date")
    private Date enrollmentDate;
    private List<ObjectId> courseEnrolled;
    private List<ObjectId> certificate;

    private Date createdAt;
    private Date updatedAt;



}