package com.cognizant.spring_learn.controller;

import com.cognizant.spring_learn.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationContoller {


    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authentication")

    public Map<String, String> authenticate() {

        String token = jwtUtil.generateToken();

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        return response;
    }

}
