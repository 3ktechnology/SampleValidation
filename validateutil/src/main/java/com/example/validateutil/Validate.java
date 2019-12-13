package com.example.validateutil;

public class Validate {
    public boolean verifyPassword(String password){
        return (!password.isEmpty() && password.length()>8)?true:false;
    }

    public boolean verifyEmail(String email){
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        return (!email.isEmpty() && email.matches(emailPattern))?true:false;
    }
}
