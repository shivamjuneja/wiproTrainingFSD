package com.trainingapps.userms.util;

import com.trainingapps.userms.exceptions.InvalidTokenException;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class TokenUtil {


    public String generateToken(String username) {
        long currentMillis = System.currentTimeMillis();
        long expiryMillis = currentMillis + (60 * 60 * 1000 * 24);
        String token = username + "," + expiryMillis;
        return token;
    }


    public String decodeToken(String token) throws InvalidTokenException {
        if(token==null||token.isEmpty()){
            throw new InvalidTokenException("token can't be null or empty");
        }
        token=token.trim();
        String parts[] = token.split(",");
        if(parts.length<2){
            throw new InvalidTokenException("token can't be null or empty");

        }
        String username = parts[0];
        String expiryText = parts[1];
        long expiryMillis = Long.parseLong(expiryText);
        long currentMillis = System.currentTimeMillis();
        if (currentMillis > expiryMillis) {
            throw new InvalidTokenException("token has expired");
        }
        return username;
    }

}
