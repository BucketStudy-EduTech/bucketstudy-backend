package com.BucketStudy.Controller;

import com.BucketStudy.Dto.AuthReq;
import com.BucketStudy.Dto.AuthRes;
import com.BucketStudy.Dto.RegisterReq;
import com.BucketStudy.Model.Role;
import com.BucketStudy.Model.User;
import com.BucketStudy.Repository.UserRepository;
import com.BucketStudy.Security.JwtService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.*;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthenticationManager authManager;
    private final UserRepository userRepo;
    private final PasswordEncoder encoder;
    private final JwtService jwt;

    public AuthController(AuthenticationManager am, UserRepository ur, PasswordEncoder pe, JwtService js) {
        this.authManager = am; this.userRepo = ur; this.encoder = pe; this.jwt = js;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterReq req) {
        if (userRepo.existsByEmail(req.getEmail())) {
            return ResponseEntity.badRequest().body(Map.of("error","Email already registered"));
        }
        User u = new User();
        u.setId(new ObjectId());
        u.setName(req.getName());
        u.setEmail(req.getEmail());
        u.setPassword(encoder.encode(req.getPassword()));
        u.setRole(req.getRole() == null ? Role.STUDENT : req.getRole());
        u.setEnrollmentDate(new Date());
        u.setCreatedAt(new Date());
        u.setUpdatedAt(new Date());
        userRepo.save(u);

        String token = jwt.generateToken(u.getEmail(), Map.of("role", u.getRole().name(), "uid", u.getId()));
        return ResponseEntity.ok(new AuthRes(token));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody AuthReq req) {
        Authentication auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.getEmail(), req.getPassword()));
        // If no exception, credentials are valid
        String token = jwt.generateToken(req.getEmail(), Map.of());
        return ResponseEntity.ok(new AuthRes(token));
    }
}

