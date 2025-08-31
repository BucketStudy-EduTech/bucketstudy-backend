//package com.BucketStudy.Controller;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.BucketStudy.Dto.LoginRequestDto;
//import com.BucketStudy.Dto.LoginResponseDto;
//import com.BucketStudy.Dto.SignUpRequestDto;
//import com.BucketStudy.Dto.SignupResponseDto;
//import com.BucketStudy.Security.AuthService;
//
//@RestController
//@RequestMapping("/auth")
//@RequiredArgsConstructor
//public class AuthController {
//
//    private  AuthService authService;
//
//    @PostMapping("/login")
//    public ResponseEntity<LoginResponseDto> login(@RequestBody LoginRequestDto loginRequestDto) {
//        return ResponseEntity.ok(authService.login(loginRequestDto));
//    }
//
//    @PostMapping("/signup")
//    public ResponseEntity<SignupResponseDto> signup(@RequestBody SignUpRequestDto signupRequestDto) {
//        return ResponseEntity.ok(authService.signup(signupRequestDto));
//    }
//}
