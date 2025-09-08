package com.BucketStudy.Dto;

public class AuthRes {
    private String token;
    public AuthRes(String token){ this.token = token; }
    public String getToken(){ return token; }
}
