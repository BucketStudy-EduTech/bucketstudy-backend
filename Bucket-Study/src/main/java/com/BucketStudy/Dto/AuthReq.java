package com.BucketStudy.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthReq {
    @Email(message = "enter a valid email")
    @NotBlank (message = "Email should be filled")
    private String email;
    @NotBlank(message = "Password can not to be blank")
    private String password;
}
