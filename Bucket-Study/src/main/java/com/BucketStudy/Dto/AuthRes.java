// src/main/java/com/BucketStudy/Dto/AuthRes.java

package com.BucketStudy.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRes {
    private String token;
    private String name;
    private String role;
    private String userId; // Changed to String to match ObjectId format
}