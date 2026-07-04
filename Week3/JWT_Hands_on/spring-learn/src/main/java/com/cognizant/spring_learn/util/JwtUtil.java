package com.cognizant.spring_learn.util;


import io.jsonwebtoken.Jwts;
import static javax.crypto.Cipher.SECRET_KEY;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Date;



@Component
public class JwtUtil {

    private  static final String SECRET_KEY="hahfiabkafhjufurhfmnmpojfjkjlfaf";

    public String generateToken(){

        String name="sample";
        return Jwts.builder()
                .setSubject(name)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
