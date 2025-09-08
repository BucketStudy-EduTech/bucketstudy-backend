package com.BucketStudy.Dto;

import com.BucketStudy.Model.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RegisterReq {
    @NotBlank
    private String name;
    @Email
    @NotBlank
    private String email;
    @Size(min=6)
    private String password;
    private Role role = Role.STUDENT;

}
